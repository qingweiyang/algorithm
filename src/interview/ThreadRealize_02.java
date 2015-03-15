package interview;

public class ThreadRealize_02 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadRealize_01().start();
		new ThreadRealize_01().start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" out i = "+i+" ...");
		}
	}

}
