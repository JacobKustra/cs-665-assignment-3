/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Business.java
 * Description: The Business.java class is a child class of the
 * EmailTemplate class and contains the basic customizations in
 * the email to make it specific to the business customer type.
 */

package edu.bu.met.cs665.assign3.customers;


import edu.bu.met.cs665.assign3.generator.EmailTemplate;

/**
 * This is the Business class which contains the Business constructor
 * method that sets all the email parts to be customized to business
 * customers.
 */
public class Business extends EmailTemplate {

  /**
   * The Business constructor method sets all the email parts to
   * be customized to business customers.
   */
  public Business(String email) {
    setEmailAddress(email);
    setSubject("A Special Deal For Our Favorite Business Customer!");
    setIntro("Dear Business Customer: " + email);
    setBody("Since you are our favorite business customer, we wanted to "
        + "share a special deal with you and only you!\nHere is a coupon "
        + "code for 20% off your next order! Use code: '20OFF'. \nWe hope "
        + "to work with you soon again!");
    setSignature("Your Favorite Company - Jacob Kustra");
  }

}
