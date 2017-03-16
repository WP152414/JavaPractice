/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

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
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] c = { "마법사", "영주", "기사", "농민" };
		Scanner scanner = new Scanner(System.in);
		int choice, power = 100;
		
		do {
			System.out.println("--------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.print("메뉴 입력 => ");
			
			 choice = scanner.nextInt();
			 
			 switch(choice){
			 case 1:
				 power += 10;
				 System.out.printf("공격력이 증가되었습니다. 현재 공격력:%d \n", power);
				 break;
			 case 2:
				 power -= 10;
				 System.out.printf("공격력이 감소되었습니다. 현재 공격력:%d \n", power);
				 break;
			 case 3:
				 int num = new Random( ).nextInt(4);
				 System.out.printf("%s(으)로 설정되었습니다.\n", c[num]);
				 break;
				 
			 case 9:
				 System.out.printf("이제 공부하세요!\n");
				 scanner.close();
				 break;
			 default:
				 System.out.printf("없는 메뉴입니다!!\n");
			 }
		} while (choice != 9);
	
	}

}
