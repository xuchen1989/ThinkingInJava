package exceptions;

//: exceptions/WithFinally.java
// Finally Guarantees cleanup.

public class WithFinally {
  static Switch sw = new Switch();
  static int[] intArray = new int[2];
  public static void main(String[] args) {
    try {
      sw.on();
      // Code that can throw exceptions...
      intArray[2] =0;
      OnOffSwitch.f();
    } catch(OnOffException1 e) {
      System.out.println("OnOffException1");
    } catch(OnOffException2 e) {
      System.out.println("OnOffException2");
    } finally {
      sw.off();
    }
  }
} /* Output:
on
off
*///:~
