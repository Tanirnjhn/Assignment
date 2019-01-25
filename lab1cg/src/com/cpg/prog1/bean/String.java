/**
 * 
 */
package com.cpg.prog1.bean;

/**
 * @author TANAGRAW
 *
 */
public class StringA{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c[]= {1,2,3,4};
        String s1 = new String(c);
        String s2 = new String(s1);
        String str;
        str= s1+s2;
        System.out.println(s1+s2);
        
	}

}
