import java.awt.*;

public class RightTriangle
{
    public static void main (String[] args)
    {
        double BaseLength = Double.parseDouble(args[0]);
        double Height = Double.parseDouble(args[1]);
        double Perimeter = BaseLength + Height + Math.sqrt(Math.pow(BaseLength, 2) + Math.pow(Height, 2));
        double Area = 0.5 * (BaseLength * Height);

        StdDraw.setPenRadius(0.003);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(0.3, 0.55, 0.7, 0.55);
        StdDraw.line(0.3, 0.55, 0.3, 0.9);
        StdDraw.line(0.7, 0.55, 0.3, 0.9);

        StdDraw.setPenRadius(0.004);
        StdDraw.setPenColor(StdDraw.RED);
        Font font1 = new Font("Calibri", Font.BOLD, 40);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.40, "Right Triangle");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.25, "Base Length: " + BaseLength);

        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.text(0.5, 0.20, "Height: " + Height);

        Font font2 = new Font("Times New Roman", Font.ITALIC, 18);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.15, "Perimeter: " + Perimeter);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.text(0.5, 0.10, "Area: " + Area);
    }
}
