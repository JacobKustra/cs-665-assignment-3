/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: EmailTemplate.java
 * Description: The EmailTemplate.java parent class contains the basic
 * information needed to create an email, from the email address
 * itself to the subject, intro, body and even signature. These
 * can all be customized as needed for each individual customer.
 */

package edu.bu.met.cs665.assign3.generator;

/**
 * This is the EmailTemplate class which is a parent class,
 * lays out the necessary email components and allows each to
 * be set. Once done, the createEmail method can be run to generate
 * a cohesive email from all the individual parts.
 */
public class EmailTemplate {
  public String emailAddress = null;
  public String subject = null;
  public String intro = null;
  public String body = null;
  public String signature = null;

  /**
   * This is the createEmail method which will combine the
   * information needed for the email into a nicely formatted
   * way and print it off.
   */
  public void createEmail() {
    System.out.println("Customer Email: " + emailAddress + "\nSubject: " + subject
        + "\n\nBody: \n"  + intro + ",\n\n" + body + "\n\nSincerely,\n"
        + signature);
  }

  /**
   * This is the setEmailAddress method which will set the email address
   * to be the customer's email.
   */
  public void setEmailAddress(String email) {
    this.emailAddress = email;
  }

  /**
   * This is the getEmailAddress method which will return
   * the customer's email address.
   */
  public String getEmailAddress() {
    return this.emailAddress;
  }

  /**
   * This is the setSubject method which will set the email subject.
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * This is the getSubject method which will return
   * the email's subject.
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * This is the setIntro method which will set the email's introduction.
   */
  public void setIntro(String intro) {
    this.intro = intro;
  }

  /**
   * This is the getIntro method which will return
   * the email's intro.
   */
  public String getIntro() {
    return this.intro;
  }

  /**
   * This is the setBody method which will set the email's body.
   */
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * This is the getBody method which will return
   * the email's body.
   */
  public String getBody() {
    return this.body;
  }

  /**
   * This is the setSignature method which will set the email's signature.
   */
  public void setSignature(String signature) {
    this.signature = signature;
  }

  /**
   * This is the getSignature method which will return
   * the email's signature.
   */
  public String getSignature() {
    return this.signature;
  }

}
