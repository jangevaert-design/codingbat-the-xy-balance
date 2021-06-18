package edu.cnm.deepdive;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists
a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

public class CodingBatTheXyBalance {

  public static void main(String[] args) {
    System.out.printf("with the String %s, the outcome is " + xyBalance("aaxbby") + ".\n", "aaxbby");
    System.out.printf("with the String %s, the outcome is " + xyBalance("aaxbb") + ".\n", "aaxbb");
    System.out.printf("with the String %s, the outcome is " + xyBalance("yaaxbb") + ".\n", "yaaxbb");
  }

  public static boolean xyBalance(String str) {

    return (str.indexOf('x') == -1 || str.lastIndexOf('x') < str.lastIndexOf('y'));
  }

}
