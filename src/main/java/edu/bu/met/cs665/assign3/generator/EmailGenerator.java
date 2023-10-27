/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: EmailGenerator.java
 * Description: The EmailGenerator.java class contains the main
 * email generating program prompt which takes the user input through
 * a menu of choices to write the customer email, choose the customer
 * type and then send that individual email, until the user decides to
 * stop sending emails altogether.
 */

package edu.bu.met.cs665.assign3.generator;

import edu.bu.met.cs665.assign3.customers.Business;
import edu.bu.met.cs665.assign3.customers.Frequent;
import edu.bu.met.cs665.assign3.customers.New;
import edu.bu.met.cs665.assign3.customers.Returning;
import edu.bu.met.cs665.assign3.customers.Vip;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


/**
 * This is the EmailGenerator class which will generate the email
 * specific to the customer after going through the menu of options
 * due to containing the sendEmail method.
 */
public class EmailGenerator {

  /**
   * This is the sendEmail class which will generate the email
   * specific to the customer after going through the menu of options
   * by utilizing the various customer type classes to customize the
   * email details. This will continue to loop until the user is
   * satisfied and selects "2" to stop sending additional emails.
   */
  public void sendEmail() {

    Integer userContinue = 1;

    while (userContinue == 1) {

      Scanner userInput = new Scanner(System.in);
      System.out.println("\nEnter Customer's Email:");
      String name = userInput.nextLine();

      EmailTemplate email = null;

      System.out.println("\nSelect the best option to describe the "
          + "customer from the options below.");
      System.out.println("Select: 1 if they are a Business Customer,"
          + "\nSelect: 2 if they are a Frequent Customer,"
          + "\nSelect: 3 if they are a New Customer,"
          + "\nSelect: 4 if they are a Returning Customer, OR"
          + "\nSelect: 5 if they are a VIP Customer");

      while (true) {
        while (!userInput.hasNextInt()) {
          System.out.println("Invalid input, please try again!");
          userInput.nextLine();
        }
        int firstInput = userInput.nextInt();
        if (firstInput == 1) {
          System.out.println("You have selected " + firstInput + " for "
              + "Business Customer.");
          email = new Business(name);
          break;
        } else if (firstInput == 2) {
          System.out.println("You have selected " + firstInput + " for "
              + "Frequent Customer.");
          email = new Frequent(name);
          break;
        } else if (firstInput == 3) {
          System.out.println("You have selected " + firstInput + " for "
              + "New Customer.");
          email = new New(name);
          break;
        } else if (firstInput == 4) {
          System.out.println("You have selected " + firstInput + " for "
              + "Returning Customer.");
          email = new Returning(name);
          break;
        } else if (firstInput == 5) {
          System.out.println("You have selected " + firstInput + " for "
              + "VIP Customer.");
          email = new Vip(name);
          break;
        } else {
          System.out.println("Invalid input, please try again!");
        }
      }

      System.out.println("\nGenerating Email Now...");
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      email.createEmail();

      System.out.println("\nSelect 1 to keep sending additional emails, "
          + "or select 2 to stop sending emails.");
      Scanner userInput2 = new Scanner(System.in);


      while (true) {
        while (!userInput2.hasNextInt()) {
          System.out.println("Invalid input, please try again!");
          userInput2.nextLine();
        }
        int input2 = userInput2.nextInt();
        if (input2 == 1) {
          System.out.println("You have selected " + userContinue + " to "
              + "keep sending emails.");
          break;
        } else if (input2 == 2) {
          System.out.println("You have selected " + userContinue + " to "
              + "stop sending emails.");
          System.out.println("Shutting down the Email Generator");
          userContinue = 2;
          break;
        } else {
          System.out.println("Invalid input, please try again!");
        }
      }
    }
  }
}
