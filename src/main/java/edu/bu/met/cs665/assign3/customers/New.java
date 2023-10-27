/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: New.java
 * Description: The New.java class is a child class of the
 * EmailTemplate class and contains the basic customizations in
 * the email to make it specific to the new customer type.
 */

package edu.bu.met.cs665.assign3.customers;

import edu.bu.met.cs665.assign3.generator.EmailTemplate;

/**
 * This is the New class which contains the New constructor
 * method that sets all the email parts to be customized to new
 * customers.
 */
public class New extends EmailTemplate {

  /**
   * The New constructor method sets all the email parts to
   * be customized to new customers.
   */
  public New(String email) {
    setEmailAddress(email);
    setSubject("A Special Deal For Our Favorite New Customer!");
    setIntro("Dear New Customer: " + email);
    setBody("Since you are our favorite new customer, we wanted to "
        + "share a special deal with you and only you!\nHere is a coupon "
        + "code for 10% off your next order! Use code: '10OFF'. \nWe hope "
        + "to work with you soon again!");
    setSignature("Your Favorite Company - Jacob Kustra");
  }

}
