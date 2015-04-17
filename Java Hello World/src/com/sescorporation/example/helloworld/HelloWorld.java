/**
 * 
 */
package com.sescorporation.example.helloworld;


/**
 * @author Michael
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String hwLine="";
		try
		{
			hwLine = Advanced.interpretLanguage("de");
		}
		catch(Exception e)
		{
			//ignore
		}
		
		System.out.println(hwLine);

	}

}
