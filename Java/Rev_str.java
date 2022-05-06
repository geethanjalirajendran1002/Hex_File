package day6;

import java.io.*;
import java.util.Scanner;
 
class Rev_str {
    public static void main (String[] args) {
       
        String str= "Geethanjali", nstr=" ";
        char ch;
       
      System.out.print("Original word:Geethanjali");
      System.out.println(" "); 
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
