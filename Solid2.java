// This program draws a cylinder (Solid 2) and calculates its volume based on inputs provided.
// This program takes two command-line arguments: Diameter of circular face and Height

import java.awt.*;

public class Solid2
{
    public static void main (String[] args)
    {
        double Diameter = Double.parseDouble(args[0]);
        double Height = Double.parseDouble(args[1]);

        double Volume = (Math.pow((Diameter/2),2) * Math.PI) * Height;

        StdDraw.ellipse(0.5, 0.45, 0.15, 0.025);
        StdDraw.ellipse(0.5, 0.9, 0.15, 0.025);
        StdDraw.line(0.35, 0.45, 0.35, 0.9);
        StdDraw.line(0.65, 0.45, 0.65, 0.9);

        StdDraw.setPenRadius(0.004);
        Font font1 = new Font("Times New Roman", Font.ITALIC, 40);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.31, "Cylinder");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.text(0.5, 0.20, "Diameter: " + Diameter);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.text(0.5, 0.15, "Height: " + Height);

        Font font2 = new Font("Calibri", Font.BOLD, 20);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.10, "Volume: " + Volume);
    }
}
