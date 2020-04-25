package javaapplication4;

public class Course
{
   private String courseName;      
   private Instructor instructor;  
   private TextBook textBook;         


   public Course(String name, Instructor instr,
                 TextBook text)
   {
      
      courseName = name;
      instructor = instr;
      textBook = text;
   }
   
 public String getName()
   {
      return courseName;
   }
 
 public Instructor getInstructor()
   {
      return instructor;
   }
 
  public TextBook getTextBook()
   {
      return textBook;
   }
  
 public String toString()
   {
      String str = "Course name: " + courseName
                   + "\nInstructor Information:\n"
                   + instructor
                   + "\nTextbook Information:\n"
                   + textBook;
      return str;
   }
}