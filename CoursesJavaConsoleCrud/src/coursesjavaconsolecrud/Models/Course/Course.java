package coursesjavaconsolecrud.Models.Course;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 *
 * @author Emilio
 */
public class Course
{

    private int id;
    private String name;
    private String instructor;
    private double price;
    private Date fechaInicio;

    public Course()
    {
    }

    public Course(int id, String name, String instructor, double price, String fechaInicio)
    {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.price = price;
        try
        {
            this.fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio);
        }
        catch (Exception e)
        {
            System.out.println("Errorto convert the date." + e.getMessage());
        }
    }

    public Course(int id, String name, String instructor, double price, Date fechaInicio)
    {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.price = price;
        this.fechaInicio = fechaInicio;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getInstructor()
    {
        return instructor;
    }

    public void setInstructor(String instructor)
    {
        this.instructor = instructor;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Date getFechaInicio()
    {
        return fechaInicio;
    }

    public String getFechaInicioString()
    {
        String date = "";
        String format = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(format);
        date = dateFormat.format(getFechaInicio());

        return date;
    }

    public void setFechaInicio(Date fechaInicio)
    {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaInicio(String fechaInicio)
    {
        try
        {
            this.fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio);
        }
        catch (Exception e)
        {
            System.out.println("Error to convert the Date." + e.getMessage());
        }
    }

}
