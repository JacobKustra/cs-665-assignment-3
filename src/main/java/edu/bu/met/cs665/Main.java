/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: Main.java
 * Description: The Main.java class contains the main method, which is
 * used to start/run an example of the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assign3.generator.EmailGenerator;

/**
 * This is the Main class which when run will initiate the customer
 * email generator program.
 */
public class Main {

  /**
   * The main method is used to start the program, which takes user
   * inputs to run through the various types of customer types that
   * can each be selected.
   */
  public static void main(String[] args) {
    EmailGenerator gen = new EmailGenerator();
    gen.sendEmail();
  }
}
