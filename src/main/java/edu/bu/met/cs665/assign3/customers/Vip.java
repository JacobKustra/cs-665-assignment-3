/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Vip.java
 * Description: The Vip.java class is a child class of the
 * EmailTemplate class and contains the basic customizations in
 * the email to make it specific to the VIP customer type.
 */

package edu.bu.met.cs665.assign3.customers;

import edu.bu.met.cs665.assign3.generator.EmailTemplate;

/**
 * This is the Vip class which contains the Vip constructor
 * method that sets all the email parts to be customized to VIP
 * customers.
 */
public class Vip extends EmailTemplate {

  /**
   * The Vip constructor method sets all the email parts to
   * be customized to VIP customers.
   */
  public Vip(String email) {
    setEmailAddress(email);
    setSubject("A Special Deal For Our Favorite VIP Customer!");
    setIntro("Dear VIP Customer: " + email);
    setBody("Since you are our favorite VIP customer, we wanted to "
        + "share a special deal with you and only you!\nHere is a coupon "
        + "code for 30% off your next order! Use code: '30OFF'. \nWe hope "
        + "to work with you soon again!");
    setSignature("Your Favorite Company - Jacob Kustra");
  }
}
