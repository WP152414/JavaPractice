/**
 * 
 */
package org.dimigo.inheritance;

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
public class IPhone extends SmartPhone{
	public IPhone(){
		
	}
	public IPhone(String mpdel, String company, int price){
		
	}
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
