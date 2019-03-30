import java.text.DecimalFormat;
/**
 * A program takes 4 inputs then calculate results.
 *
 * Homework 05
 * @author Le Cai LZC0033 COMP1210-005
 * @version 2/07/18
 */
public class ConicalFrustum {
  /**
   * takes label radius1 radius2 and height, go through set of methods.
   * returns a String at the end.
   * @param args Comand line arguments - not used.
   */

   //declare variables//
   private String label = "";
   private double radius1;
   private double radius2;
   private double height;

   //constructor//
   /**
    * constructor takes in parameters.
    *
    * @param labelIn takes in a string set as label.
    * @param r1In takes in a double and set as radius1.
    * @param r2In takes in a double and set as radius2.
    * @param hIn takes in a double and set as height.
    */

   public ConicalFrustum(String labelIn, double r1In, double r2In, double hIn) {
     // check label
      setLabel(labelIn);
      setRadius1(r1In);
      setRadius2(r2In);
      setHeight(hIn);
   }

   //METHODS//
   //set methods
   //set label
   /**
    * sets label from string labelIn.
    *
    * @param labelIn takes a string and sets as label.
    * @return isSet returns a boolean value.
    */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   //set radius1
   /**
    * sets radius1 from a double value.
    *
    * @param radius1In takes a double and sets as radius1.
    * @return radius1pos returns a boolean value to indicae is radius2 postive.
    */
   public boolean setRadius1(double radius1In)  {
      boolean radius1pos = false;
      if (radius1In > 0) {
         radius1 = radius1In;
         radius1pos = true;
      }
      return radius1pos;
   }
   //set radius2
   /**
    * sets radius 2 from a double value.
    *
    * @param radius2In takes double and sets as radius2.
    * @return radius2pos returns a boolean value to indicate is radius2 postive.
    */
   public boolean setRadius2(double radius2In) {
      boolean radius2pos = false;
      if (radius2In > 0) {
         radius2 = radius2In;
         radius2pos = true;
      }
      return radius2pos;
   }
   //set height
   /**
    * sets height from a double value.
    *
    * @param heightIn takes a double and sets as height.
    * @return heightpos returns a boolean value to indicate is height postive.
    */
   public boolean setHeight(double heightIn)  {
      boolean heightpos = false;
      if (heightIn > 0)  {
         height = heightIn;
         heightpos = true;
      }
      return heightpos;
   }

   //get methods//
   //get label
   /**
    * returns label.
    *
    * @return returns label.
    */
   public String getLabel()  {
      return label;
   }
   //get radius1
   /**
    * returns radius1.
    *
    * @return returns radius1.
    */
   public double getRadius1()  {
      return radius1;
   }
   //get radius2
   /**
    * returns radius2.
    *
    * @return returns radius2.
    */
   public double getRadius2()  {
      return radius2;
   }
   //get height
   /**
    * returns height.
    *
    * @return returns height.
    */
   public double getHeight() {
      return height;
   }

   //Calculation methods
   //volume
   /**
    * calculate volume based on data we have.
    *
    * @return returns volume.
    */
   public double volume()  {
      double v1, v2, volume;
      v1 = (Math.PI * height) / 3;
      v2 = Math.pow(radius1, 2) + Math.pow(radius2, 2) + radius1 * radius2;
      volume = v1 * v2;
      return volume;
   }
   //slantHeight
   /**
    * calculate slantHeight based on data we have.
    *
    * @return returns slantHeight.
    */
   public double slantHeight() {
      double s1, s2, slantHeight;
      s1 = radius1 - radius2;
      s2 = Math.pow(s1, 2) + Math.pow(height, 2);
      slantHeight = Math.sqrt(s2);
      return slantHeight;
   }
   //lateral surface area
   /**
    * calculate lateralSurfaceArea based on data we have.
    *
    * @return returns lateralSurfaceArea.
    */
   public double lateralSurfaceArea()  {
      double lSurfaceArea;
      lSurfaceArea = Math.PI * (radius1 + radius2) * slantHeight();
      return lSurfaceArea;
   }
   //total surface area
   /**
    * calculate totalSurfaceArea based on data we have.
    *
    * @return returns totalSurfaceArea.
    */
   public double totalSurfaceArea()  {
      double tSurfaceArea;
      tSurfaceArea = (radius1 + radius2) * slantHeight();
      tSurfaceArea = Math.pow(radius1, 2) + Math.pow(radius2, 2) + tSurfaceArea;
      tSurfaceArea = Math.PI * tSurfaceArea;

      return tSurfaceArea;
   }
   //to string
   /**
    * format the data we have and print them in output.
    *
    * @return returns output string containing results.
    */
   public String toString()  {
      String pattern = "#,##0.0##";
      DecimalFormat df = new DecimalFormat(pattern);
      String fRadius1 = df.format(radius1);
      String fRadius2 = df.format(radius2);
      String fheight = df.format(height);
      String fvolume = df.format(volume());
      String fSlantHeight = df.format(slantHeight());
      String fLSurfaceArea = df.format(lateralSurfaceArea());
      String fTSurfaceArea = df.format(totalSurfaceArea());
      String output = "ConicalFrustum \"" + label + "\" with radius1 = "
         + fRadius1 + ", radius2 = " + radius2 + ", and height = " + height
         + " has:\n\t";
      output += "volume = " + fvolume + " cubic units\n\t";
      output += "slant height = " + fSlantHeight + " units\n\t";
      output += "lateral surface area = " + fLSurfaceArea + " units\n\t";
      output += "total surface area = " + fTSurfaceArea + " square units";
      return output;

   }
}
