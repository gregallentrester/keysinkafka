package net.greg.examples.springsecurity;

// https://bit.ly/3vpMDgf
import java.awt.*;
import java.awt.event.*;

public class App {
  private static final Robot BOT = new Robot();

  public static void main(String ... args) {
    type();
  }

  private static void type() {
    try {
      while (Boolean.TRUE) {

        BOT.keyPress(KeyEvent.VK_A);
        BOT.keyRelease(KeyEvent.VK_A);
        System.err.println("Q");
      }
    } catch (AWTException e) { e.printStackTrace(); }
  }
}
