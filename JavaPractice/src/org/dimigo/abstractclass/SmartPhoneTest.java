/**
 * 
 */
package org.dimigo.abstractclass;

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
public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] phones = {
				new IPhone("IPhone 7", "애플", 900000),
				new Galaxy("Galaxy s8", "삼성", 800000)
		};
		
		for(SmartPhone s : phones){
			System.out.println(s);
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
			System.out.println(" ");
		}
		
	}

}
