package interview.worksapplication;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String rANDc = sc.nextLine();
		int row = Integer.parseInt(rANDc.split(" ")[0]);
		int col = Integer.parseInt(rANDc.split(" ")[1]);
		int list[][] = new int[row][col];
		for(int i = 0 ; i < row ; i++) {
			String str[] = sc.nextLine().split(" ");
			for(int j = 0 ; j < col ; j++) {
				list[i][j] = Integer.parseInt(str[j]);
			}
		}
		new Main().test(list, row, col);
	}
	
	/**
	 * 本题采用了图的深度遍历非递归思想完成
	 * 
	 * @param list
	 * @param row
	 * @param col
	 */
	public void test(int[][] list, int row, int col) {
		// 路径，且将到当前节点的路径总值保持在数组［2］中
		Stack<Integer[]> path = new Stack<Integer[]>();
		HashMap<Integer, Integer> hasVisited = new HashMap<Integer, Integer>();
		int max = 0;
		
		for(int i = 0 ; i < row ; i++) {
			if(list[i][0] != -1) {
				int pathVal = 0;
				//stack initial
				pathVal += list[i][0];
				path.push(new Integer[]{i, 0, pathVal});
				hasVisited.put(i*col + 0, -1);
				
				//深度遍历
				while(!path.empty()) {
					Integer[] v = path.peek();
					//判断点v的上下左三点是否被遍历过
					int curIndex = v[0] * col + v[1];
					//找到下个要被遍历的点
					boolean hasTeleport = false;
					if(hasVisited.containsKey(curIndex) && hasVisited.get(curIndex) < 2) {
						int tmpPos = hasVisited.get(curIndex) + 1;
						int jR = v[0] + (tmpPos - 1);
						if(jR < 0 || jR >= row) {
							hasTeleport = true;
						}
						// 这里实现 瞬移 要求
						jR = (jR + row )% row;
						
						int jC = v[1] + tmpPos%2;
						if(jC < col && list[jR][jC] != -1) {
							//在界内
							//这里需要判断该点是否被访问过
							if(!hasVisited.containsKey(jR * col + jC)) {
								if(hasTeleport) {
									//瞬移后pathVal清0
									pathVal = 0;
								} 
								pathVal += list[jR][jC];
								//判断v是否是终点
								if(jC == col - 1) {
									max = max > pathVal ? max : pathVal;
								}
								//将遍历后点压栈
								path.push(new Integer[]{jR, jC, pathVal});
								//标记此点的父节点已遍历的位置
								hasVisited.put(curIndex, tmpPos);
								//当前点初始化
								hasVisited.put(jR * col + jC, -1);	
							} else {
								//当前点的领节点＋1
								hasVisited.put(curIndex, hasVisited.get(curIndex) + 1);	
							}
						} else {
							//当前点的领节点＋1
							hasVisited.put(curIndex, hasVisited.get(curIndex) + 1);	
						}
	
					} else {
						//没有找到当前点未被遍历的点，当前点出栈
						Integer[] tmp = path.pop();
						if(!path.empty()) {
							pathVal = path.peek()[2];
						} else {
							pathVal = 0;
						}
						hasVisited.remove(tmp[0] * col + tmp[1]);
					}

				}
			}
		}
		
		System.out.print(max);
	}

}
