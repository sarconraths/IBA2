package com.herdt.java8.kap10;

class TestMedia
{
  public static void main(String[] args)
  {
    Media medium1 = new Picture();
    Media medium2 = new Video();
    Media medium3 = new Audio();

    System.out.println("Medium 1:");
    medium1.display();
    medium1.play();
    medium1.stop();

    System.out.println("Medium 2:");
    medium2.display();
    medium2.play();
    medium2.stop();

    System.out.println("Medium 3:");
    medium3.display();
    medium3.play();
    medium3.stop();
 }
}

