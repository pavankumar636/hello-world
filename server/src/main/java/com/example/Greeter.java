package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Generate a greeting message for the supplied name.
   *
   * <p>If {@code someone} is {@code null} or empty, the string {@code "World"}
   * will be used instead.</p>
   *
   * @param someone name of a person
   * @return greeting message
   */
  public String greet(String someone) {
    String name = (someone == null || someone.trim().isEmpty()) ? "World" : someone;
    return String.format("Hello, %s!", name);
  }
}
