package com.herdt.java8.kap11;

public class Exercise1
{
  public static void main(String[] args)
  {
    String s1 = "Meier";
    String s2 = "Mayer";

    if(s1.compareTo(s2) <= 0)
    {
      System.out.println(s1);
      System.out.println(s2);
    }
    else
    {
      System.out.println(s2);
      System.out.println(s1);
    }
  }
}