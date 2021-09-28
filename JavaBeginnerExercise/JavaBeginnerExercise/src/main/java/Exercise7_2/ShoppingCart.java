/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7_2;

/**
 *
 * @author admin
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Dave Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
          
        //Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);

	// Put the full name back together, using StringBuilder append method.
	//   You can just enter the String literal for the last name.
	//   Print the full name.
        sb.append(" Smith");
	
	// Challenge: sb.append(custName.substring(spaceIdx));

        System.out.println(sb);
    }   
}
