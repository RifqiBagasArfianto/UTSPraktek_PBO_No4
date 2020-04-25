/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author RIFQI BAGAS
 */
public class JavaApplication4 {
   public static void main(String[] args)
   {
      Instructor myInstructor =
          new Instructor("Arfianto", "Rifqi Bagas", "18051214052");

      TextBook myTextBook =
          new TextBook("Belajar Sistem Informasi",
                       "Abdul Rohim", "Abdul Rohman");

      Course myCourse = 
         new Course("Information Systems", myInstructor,
                    myTextBook);

      System.out.println(myCourse);
   }
}
