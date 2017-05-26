/**
 * 
 */
package org.dimigo.interfaces;

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
public class SybaseDB implements IDBManager{
			
	public void insert() {
		System.out.println("Sybase DB 저장");	
	};
	public void search() {
		System.out.println("Sybase DB 조회");	
	};
	public void update() {
		System.out.println("Sybase DB 변경");	
	};
	public void delete() {
		System.out.println("Sybase DB 삭제");	
	};

}
