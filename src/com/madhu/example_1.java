package com.madhu;

import java.util.ArrayList;



public class example_1 {

	public  static void main(String[] args) {
		ArrayList<Integer> arrlist= new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(50);
		arrlist.add(60);
		arrlist .set(3, 80);
		System.out.println("the element after replacing "+arrlist);
		// creating another arraylist
		ArrayList<Integer>arrlist2=  new ArrayList<Integer>();
		arrlist2.add(70);
		arrlist.add(90);
		arrlist.add(100);
		
		System.out.println("the after another arraylist"+arrlist);
	
		

	}

}
