import java.awt.*;

public class Square
{
    public static void main (String[] args)
    {
        double SideLength = Double.parseDouble(args[0]);
        double Perimeter = 4 * SideLength;
        double Area = Math.pow(SideLength, 2.0);

        StdDraw.square(0.5, 0.65, 0.25);

        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.30, "Square");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.20, "Side Length: " + SideLength);

        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.15, "Perimeter: " + Perimeter);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.5, 0.10, "Area: " + Area);
    }
}
