//*********************************************************************************************
//  Title:  Circle.java       
//  Author: Miguel A Rodriguez
//  Date:   1/1/2015
//  Course: CSC 112-001
//*********************************************************************************************
//  Description:
//*********************************************************************************************
//         Read the dimensions of a Circle from an input file.
//         Make appropiate calculations for the file using radius to calculate area and perimeter.
// 
//*********************************************************************************************
   
   
//         UML Diagram for this helper class         
//          ***********************************************************************************     
//Class:     Circle
//          ***********************************************************************************
//Variables&Objects: 
//            -radius:     Double
//            -form:      DecimalFormat
//          ************************************************************************************
//Methods:
//            +Circle( double rad) 
//            +getradius(): double
//            +computeDiameter(): double
//            +toString(): String
//            +computeArea(): double
//          *************************************************************************************   
import java.text.*;

public class Circle extends Shape
{
  protected DecimalFormat format = new DecimalFormat("0.##");
  
  public double radius;
   
  
  //---------------------------------------------------------------------------
   //  Sets up the circle by entering its radius
   //---------------------------------------------------------------------------
   public Circle( double rad ) 
   {
      radius = rad;
      
      
   }

   //---------------------------------------------------------------------------
   //  Returns the double value of the radius
   //---------------------------------------------------------------------------
   public double getradius() 
   {
      return radius;
   }
   
  //****************************************************************************
  //   Returns the calculated value of the diameter
  //****************************************************************************
   public double computeDiameter() 
   {
      return  2 * radius;
   }

     
   //---------------------------------------------------------------------------
   //  Returns the calculated value of the area.
   //---------------------------------------------------------------------------
   public double computeArea() 
   {
      return  Math.PI * Math.pow(radius, 2);
   }
   //---------------------------------------------------------------------------
   //  Returns the calculated value of the perimeter.
   //---------------------------------------------------------------------------
   public double computePerimeter() 
   {
      return  2 * Math.PI * radius;
   }
   
   //---------------------------------------------------------------------------
   //  Returns pertinent information about the circle
   //---------------------------------------------------------------------------
   public String toString() 
   {
      return "Circle: diameter is " + format.format(computeDiameter()) + 
             ", circumference is " + format.format(computePerimeter()) +
             " and area is " + format.format(computeArea());
   }
}
  
 
