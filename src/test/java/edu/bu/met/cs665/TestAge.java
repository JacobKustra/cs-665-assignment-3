/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: TestAge.java
 * Description: The TestAge.java class contains all of
 * my unit tests for the program.
 */


package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.assign3.customers.Business;
import edu.bu.met.cs665.assign3.customers.Frequent;
import edu.bu.met.cs665.assign3.customers.New;
import edu.bu.met.cs665.assign3.customers.Returning;
import edu.bu.met.cs665.assign3.customers.Vip;
import edu.bu.met.cs665.assign3.generator.EmailTemplate;
import org.junit.Test;

/**
 * This is the TestAge Class, containing unit tests for my custom
 * email generator program which customizes each email based on the
 * customer type.
 */
public class TestAge {

    /**
     * This is the testBusiness method, which will create an
     * instance of a business customer and will generate the
     * customized email and see that the subject is specific
     * to the business customer.
     */
    @Test
    public void testBusiness() {
        System.out.println("\nTest: Business Customer");
        // Given: a Business Customer with the following email
        EmailTemplate businessEmail = new Business("Jeff@bu.edu");

        // When: the business customer's email is created
        businessEmail.createEmail();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(businessEmail.getSubject(), "A Special Deal "
            + "For Our Favorite Business Customer!");
    }

    /**
     * This is the testFrequent method, which will create an
     * instance of a frequent customer and will generate the
     * customized email and see that the subject is specific
     * to the frequent customer.
     */
    @Test
    public void testFrequent() {
        System.out.println("\nTest: Frequent Customer");
        // Given: a Frequent Customer with the following email
        EmailTemplate frequentEmail = new Frequent("Sally@bu.edu");

        // When: the frequent customer's email is created
        frequentEmail.createEmail();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(frequentEmail.getSubject(), "A Special Deal For "
            + "Our Favorite Frequent Customer!");
    }


    /**
     * This is the testNew method, which will create an
     * instance of a new customer and will generate the
     * customized email and see that the subject is specific
     * to the new customer.
     */
    @Test
    public void testNew() {
        System.out.println("\nTest: New Customer");
        // Given: a New Customer with the following email
        EmailTemplate newEmail = new New("Johnny23@bu.edu");

        // When: the new customer's email is created
        newEmail.createEmail();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(newEmail.getSubject(), "A Special Deal "
            + "For Our Favorite New Customer!");
    }

    /**
     * This is the testReturning method, which will create an
     * instance of a returning customer and will generate the
     * customized email and see that the subject is specific
     * to the returning customer.
     */
    @Test
    public void testReturning() {
        System.out.println("\nTest: Returning Customer");
        // Given: a Returning Customer with the following email
        EmailTemplate returningEmail = new Returning("PhillipJr@bu.edu");

        // When: the returning customer's email is created
        returningEmail.createEmail();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(returningEmail.getSubject(), "A Special Deal For "
            + "Our Favorite Returning Customer!");
    }


    /**
     * This is the testVip method, which will create an
     * instance of a VIP customer and will generate the
     * customized email and see that the subject is specific
     * to the VIP customer.
     */
    @Test
    public void testVip() {
        System.out.println("\nTest: VIP Customer");
        // Given: a VIP Customer with the following email
        EmailTemplate vipEmail = new Vip("TheVIPClient@bu.edu");

        // When: the VIP customer's email is created
        vipEmail.createEmail();

        // Then: we confirm the expected result is the same as the value obtained from
        // the getter method
        assertEquals(vipEmail.getSubject(), "A Special Deal For "
            + "Our Favorite VIP Customer!");
    }

}
