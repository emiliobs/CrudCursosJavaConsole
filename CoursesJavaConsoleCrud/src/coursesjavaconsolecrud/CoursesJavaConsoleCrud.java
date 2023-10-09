/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursesjavaconsolecrud;

import coursesjavaconsolecrud.ConnectioDB.ConecctionWithDB;
import coursesjavaconsolecrud.DAO.CourseDAO;
import coursesjavaconsolecrud.Models.Course.Course;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class CoursesJavaConsoleCrud
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CourseDAO courseDAO = new CourseDAO();
        Course course = new Course();
        List<Course> coursesList = new LinkedList<Course>();
        int option = Integer.MAX_VALUE;
        String DateT = "";
        String dateP = "";

        System.out.println("===============================================================================================");
        while (option != 0)
        {
            System.out.print("What would You like to do?"
                    + "\n 1-Insert New Course"
                    + "\n 2-Update of the Course"
                    + "\n 3-Delete the Course"
                    + "\n 4-Show one Course"
                    + "\n 5-Course List"
                    + "\n Enter 0 for Exit from the Program: ");

            do
            {
                try
                {
                    option = scanner.nextInt();
                }
                catch (Exception e)
                {
                    System.out.println("Error, please enter a valid number.");
                    scanner.nextLine();
                }
            }
            while (option == Integer.MAX_VALUE);

            switch (option)
            {
                case 0:
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println("--------------------------------------Leavin the Program---------------------------------------");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    break;
                case 1:
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println("--------------------------------------Insert New Data---------------------------------------");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.print("Please Enter the Name of the New Course: ");
                    course.setName(scanner.next());
                    scanner.nextLine();
                    System.out.print("Please Enter the Name of the Instructor: ");
                    course.setInstructor(scanner.next());
                    scanner.nextLine();
                    System.out.print("Please Enterthe Price of the Course: ");
                    course.setPrice(Double.MAX_VALUE);
                    while (course.getPrice() == Double.MAX_VALUE)
                    {
                        try
                        {
                            course.setPrice(scanner.nextDouble());
                        }
                        catch (Exception e)
                        {
                            System.out.println("Error, please enter a number valid.");
                            scanner.nextLine();
                        }

                        if (Double.compare(course.getPrice(), 0) < 0)
                        {
                            course.setPrice(Double.MAX_VALUE);
                            System.out.println("The price can be 0 but never less than 0");
                        }
                    }                    
                    break;
                default:
                    System.out.println("Error. Please enter a number valid.");

            }
        }

    }

}
