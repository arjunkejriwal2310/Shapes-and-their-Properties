import java.awt.*;

public class RegularPolygon
{
    public static void main (String[] args)
    {
        double Edges = Double.parseDouble(args[0]);
        double EdgeLength = Double.parseDouble(args[1]);
        double Perimeter = Edges * EdgeLength;
        double Apothem = EdgeLength / (2 * Math.tan(Math.PI / Edges));
        double Area = 0.5 * (Apothem * Perimeter);

        StdDraw.setPenRadius(0.0035);
        StdDraw.line(0.42, 0.6, 0.58, 0.6);
        StdDraw.line(0.42, 0.6, 0.365, 0.75);
        StdDraw.line(0.58, 0.6, 0.635, 0.75);
        StdDraw.line(0.365, 0.75, 0.5, 0.86);
        StdDraw.line(0.635, 0.75, 0.5, 0.86);

        StdDraw.setPenRadius(0.003);
        StdDraw.setPenColor(StdDraw.GREEN);
        Font font1 = new Font("Times New Roman", Font.BOLD, 35);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.45, "Regular Polygon");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.text(0.5, 0.25, "Number of Edges: " + Edges);

        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.text(0.5, 0.20, "Edge Length: " + EdgeLength);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.5, 0.15, "Perimeter: " + Perimeter);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.10, "Area: " + Area);
    }
}
