package test;

/**
 * 
 * @author yqw
 *采用生产者消费者思想解决
 *
 */
public class Test {

    public static void main(String []args){
        Container con = new Container();
        Producer p = new Producer(con);
        Consumer c = new Consumer(con);
        new Thread(p).start();
        new Thread(c).start();
    }
}
class Apples{
    int id;
    public Apples(int id){
        this.id=id;
    }
    public String toString(){
        return "苹果"+this.id;
    }
}
class Container{
    private int index = 0;
    Apples[] apples = new Apples[5];

    public synchronized void push(Apples apple){
        while(index==apples.length){//当容器满了，生产者等待
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        apples[index]=apple;
        index++;
        notifyAll();//当生产者放入商品后通知消费者
    }

    public synchronized Apples pop(){
        while(index==0){//当容器内没有商品是等待
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        index--;
        notifyAll();//当消费者消费了商品后通知生产者
        return apples[index];
    }
}
class Producer implements Runnable{

    Container con = new Container();
    public Producer(Container con){
        this.con=con;
    }

    public void run(){
        for(int i=0; i<20; i++){
            Apples apple = new Apples(i);
            con.push(apple);
            System.out.println("生产了："+apple);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
class Consumer implements Runnable{

    Container con = new Container();
    public Consumer(Container con){
        this.con=con;
    }

    public void run(){
        for(int i=0; i<20; i++){
            if(con.apples.length == 0){
        		continue;
        	}
            Apples apple=con.pop();
            System.out.println("消费了："+apple);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    
}