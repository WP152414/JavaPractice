/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ HelloWorld
 *
 * 1. 개요 :
 * 2. 작성일 : 3/6
 * </pre>
 *
 * @author      : 안문수
 * @version     : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	
	public void printArr(String[]ar, String[][] arr){
		for(int i =0; i < arr.length; i++){
			System.out.println("<<"+ar[i]+">>");
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[][] memberName = { 
				{"GD", "태양", "대성", "탑", "승리"}, 
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"} 
			};
		IdolGroup obj =  new IdolGroup();
		obj.printArr(groupName, memberName);
	}

}
