package coursesjavaconsolecrud.DAO;

import coursesjavaconsolecrud.Models.Course.Course;
import coursesjavaconsolecrud.ConnectioDB.ConecctionWithDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Emilio
 */
public class CourseDAO
{

    Connection connection = null;
    boolean flag;

    public boolean InsertCourse(Course course)
    {

        String sql = "insert into cursos (name, instructor, price, fechaInicio) values(?,?,?,?)";

        try
        {
            ConecctionWithDB conecctionWithDB = new ConecctionWithDB();
            PreparedStatement preparedStatement = conecctionWithDB.ConnectDB().prepareStatement(sql);

            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getInstructor());
            preparedStatement.setDouble(3, course.getPrice());
           preparedStatement.setString(4, course.getFechaInicioString());
            if (preparedStatement.executeUpdate() == 1)
            {
                flag = true;
                System.out.println("Inserted Data!");
            }
            else
            {
                System.out.println("Sorry, The data could not be inserted!");
            }

            if (preparedStatement.executeUpdate() == 1)
            {
                flag = true;
                System.out.println("Course Inserted!");
            }
            else
            {
                System.out.println("Sorry Course doesn't inserted!");
            }

            conecctionWithDB.ConnectDB().close();

        }
        catch (Exception e)
        {
            System.out.println("Error - en class Insert: " + e.getMessage());

        }

        return flag;
    }

}
