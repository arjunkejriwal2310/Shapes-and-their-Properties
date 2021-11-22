import java.awt.*;

public class Circle
{
    public static void main (String[] args)
    {
        double Diameter = Double.parseDouble(args[0]);
        double Perimeter = Diameter * Math.PI;
        double Area = Math.pow((Diameter / 2),2) * Math.PI;

        StdDraw.setPenRadius(0.005);
        StdDraw.circle(0.5, 0.75, 0.2);

        StdDraw.setPenRadius(0.003);
        StdDraw.setPenColor(StdDraw.RED);
        Font font1 = new Font("Arial", Font.BOLD, 40);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.40, "Circle");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.text(0.3, 0.25, "Diameter: " + Diameter);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.text(0.5, 0.20, "Perimeter: " + Perimeter);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.7, 0.15, "Area: " + Area);
    }
}
