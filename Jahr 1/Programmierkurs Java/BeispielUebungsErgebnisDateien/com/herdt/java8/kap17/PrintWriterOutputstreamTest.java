package com.herdt.java7.kap17;

import java.io.*;
import static  java.lang.Math.PI;

class PrintWriterOutputstreamTest
{
  public static void main(String[] args)
  {

      PrintWriter pw = new PrintWriter(System.out);

      pw.println("Berechnung des Flaecheninhalts fuer Kreise mit"); // Ausgabe eines Strings

      for(int r = 1; r <= 10; r++)
      {
        pw.print("Radius r = " + r + ": "); // Ausgabe eines Strings
        pw.println(PI * r * r); // Ausgabe eines double-Wertes
      }

      pw.close();


  }
}