/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Frequent.java
 * Description: The Frequent.java class is a child class of the
 * EmailTemplate class and contains the basic customizations in
 * the email to make it specific to the frequent customer type.
 */

package edu.bu.met.cs665.assign3.customers;

import edu.bu.met.cs665.assign3.generator.EmailTemplate;

/**
 * This is the Frequent class which contains the Frequent constructor
 * method that sets all the email parts to be customized to frequent
 * customers.
 */
public class Frequent extends EmailTemplate {

  /**
   * The Frequent constructor method sets all the email parts to
   * be customized to frequent customers.
   */
  public Frequent(String email) {
    setEmailAddress(email);
    setSubject("A Special Deal For Our Favorite Frequent Customer!");
    setIntro("Dear Frequent Customer: " + email);
    setBody("Since you are our favorite frequent customer, we wanted to "
        + "share a special deal with you and only you!\nHere is a coupon "
        + "code for 5% off your next order! Use code: '5OFF'. \nWe hope "
        + "to work with you soon again!");
    setSignature("Your Favorite Company - Jacob Kustra");
  }

}
