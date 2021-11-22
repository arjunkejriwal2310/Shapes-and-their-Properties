import java.awt.*;

public class Rectangle
{
    public static void main (String[] args)
    {
        double BaseLength = Double.parseDouble(args[0]);
        double Height = Double.parseDouble(args[1]);
        double Perimeter = 2 * (BaseLength + Height);
        double Area = BaseLength * Height;

        StdDraw.setPenRadius(0.004);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.rectangle(0.5, 0.75, 0.35, 0.17);

        StdDraw.setPenRadius();
        StdDraw.setPenColor();
        Font font1 = new Font("Arial", Font.ITALIC, 40);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.40, "Rectangle");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.text(0.5, 0.25, "Base Length: " + BaseLength);

        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.text(0.5, 0.20, "Height: " + Height);

        Font font2 = new Font("Arial", Font.BOLD, 20);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.text(0.5, 0.15, "Perimeter: " + Perimeter);

        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.text(0.5, 0.10, "Area: " + Area);
    }
}
