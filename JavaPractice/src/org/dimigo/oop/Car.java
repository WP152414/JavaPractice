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
public class Car {
	
	private String company = "현대자동차" ;
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
	public void setCompany(String newcompany){
		company = newcompany;
	}
	public void setModel(String newmodel){
		model = newmodel;
	}
	public void setColor(String newcolor){
		color = newcolor;
	}
	public void setMaxSpeed(int newmaxSpeed){
		maxSpeed = newmaxSpeed;
	}
	public void setPrice(int newprice){
		price = newprice;
	}
	
	public void setCompany2(String newcompany2){
		company = newcompany2;
	}
	public void setModel2(String newmodel2){
		model = newmodel2;
	}
	public void setColor2(String newcolor2){
		color = newcolor2;
	}
	public void setMaxSpeed2(int newmaxSpeed2){
		maxSpeed = newmaxSpeed2;
	}
	public void setPrice2(int newprice2){
		price = newprice2;
	}
}
