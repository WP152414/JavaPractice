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
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snack = {new Snack("새우깡", "농심", 1100, 2), new Snack("콘칩", "크라운", 1200, 1), new Snack("허니버터칩", "해태", 1500, 4)};
		for(int i=0; i<3; i++){
			System.out.println(snack[i].toString());
			System.out.println();
		}
		System.out.println("총 구매 금액: " + String.format("%,d", (snack[0].calcPrice()+snack[1].calcPrice()+snack[2].calcPrice())) + "원");
	}

}
