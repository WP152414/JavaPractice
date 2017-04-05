/**
 * 
 */
package org.dimigo.oop;

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
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"1.가장 좋아하는 가수는? ", "2.가장 좋아하는 배우는? ", "3.가장 좋아하는 과목은? "};
		String[] answers = {"아이유", "이광수", "스포츠 문화"};
		for(int i=0; i<3; i++){
			System.out.println(questions[i]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answers[i].equals(answer)){
				System.out.println("정답입니다!");
			}
			else System.out.println("틀렸습니다1");			
		}
		System.out.println("<< 결과 출력 >>");
		for(int i=0; i<3; i++){
			StringBuilder sb = new StringBuilder(questions[i]);
			System.out.println(sb.append(answers[i]) + "입니다.");
		}
		
	}
}
