package com.herdt.java8.kap14;

public class Exercise3
{
  public Exercise3()
  {
    System.out.println("10111011 ist " + BinaryStringToNumber.parseBinary("10111011"));
    String s = "10511011";
    System.out.println(s + " ist " + BinaryStringToNumber.parseBinary(s));
  }
  public static void main(String[] args)
  {
    Exercise3 exercise31 = new Exercise3();
  }
}
