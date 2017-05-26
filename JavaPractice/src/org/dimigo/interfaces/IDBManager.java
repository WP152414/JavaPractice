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
public interface IDBManager {
	public static String ORACLE_DATABASE = "ORACLE";
	public static String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	
	public static IDBManager getDBObject(String database) {
		if (database.equals(ORACLE_DATABASE))return new OracleDB();
		else if (database.equals(SYBASE_DATABASE))return new SybaseDB();
		else return null;
	}
}
