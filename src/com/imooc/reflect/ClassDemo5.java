package com.imooc.reflect;

public class ClassDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClassUtil.printConMessage("hello");
		ClassUtil.printConMessage(new Integer(1));*/
		
		ClassUtil.printConMessage(new User());
		System.out.println("---------");
		ClassUtil.printConMessage(new User("a","b",1));
	}

}
