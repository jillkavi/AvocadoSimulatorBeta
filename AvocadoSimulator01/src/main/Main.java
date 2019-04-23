/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;
import avocado.Avocado.enumCondition;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	//enum myEnum {A,B,C,D};	// Demo of enumerated date type

	
	public static void main(String[] args) {
		//Declare and instantiate and Avocado object
		Avocado bob = new Avocado("green", enumCondition.fresh, 6);
		
		
		//myEnum e = myEnum.A;
		//e = myEnum.B;
		//System.out.println(e.toString());

	}
}
