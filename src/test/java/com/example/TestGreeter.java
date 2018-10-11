package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * JUnit test class.
 * This is a comment change that Ive made in Eclipse to experiment using GIT
 * inside the Eclipse environment.
 * This change was made at 14:32.
 *
 */
public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
