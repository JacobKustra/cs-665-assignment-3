/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Returning.java
 * Description: The Returning.java class is a child class of the
 * EmailTemplate class and contains the basic customizations in
 * the email to make it specific to the returning customer type.
 */

package edu.bu.met.cs665.assign3.customers;

import edu.bu.met.cs665.assign3.generator.EmailTemplate;

/**
 * This is the Returning class which contains the Returning constructor
 * method that sets all the email parts to be customized to returning
 * customers.
 */
public class Returning extends EmailTemplate {

  /**
   * The Returning constructor method sets all the email parts to
   * be customized to returning customers.
   */
  public Returning(String email) {
    setEmailAddress(email);
    setSubject("A Special Deal For Our Favorite Returning Customer!");
    setIntro("Dear Returning Customer: " + email);
    setBody("Since you are our favorite returning customer, we wanted to "
        + "share a special deal with you and only you!\nHere is a coupon "
        + "code for 15% off your next order! Use code: '15OFF'. \nWe hope "
        + "to work with you soon again!");
    setSignature("Your Favorite Company - Jacob Kustra");
  }

}
