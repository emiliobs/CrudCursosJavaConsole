package coursesjavaconsolecrud.ConnectioDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Emilio
 */
public class ConecctionWithDB
{

    Connection connection = null;
    static String bd = "curso";
    static String user = "root";
    static String password = "root";
    static String path = "jdbc:mysql://localhost:3306/" + bd;

    public Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(path, user, password);
            //System.out.println("Connected with DB.");

        }
        catch (Exception e)
        {
            System.out.println("Error - Class ConnectionWithDB: " + e.getMessage());
        }

        return connection;
    }

}
