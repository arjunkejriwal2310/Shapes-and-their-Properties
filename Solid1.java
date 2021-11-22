// This program draws a cuboid (Solid 1) and calculates its volume based on inputs provided.
// This program takes three command-line arguments: Base length, Height, and Depth

import java.awt.*;

public class Solid1
{
    public static void main (String[] args)
    {
        double BaseLength = Double.parseDouble(args[0]);
        double Height = Double.parseDouble(args[1]);
        double Depth = Double.parseDouble(args[2]);

        double Volume = BaseLength * Height * Depth;

        StdDraw.line(0.1, 0.35, 0.4, 0.35);
        StdDraw.line(0.1, 0.35, 0.1, 0.65);
        StdDraw.line(0.4, 0.35, 0.4, 0.65);
        StdDraw.line(0.1, 0.65, 0.4, 0.65);

        StdDraw.line(0.6, 0.55, 0.9, 0.55);
        StdDraw.line(0.6, 0.55, 0.6, 0.85);
        StdDraw.line(0.9, 0.55, 0.9, 0.85);
        StdDraw.line(0.6, 0.85, 0.9, 0.85);

        StdDraw.line(0.1, 0.35, 0.6, 0.55);
        StdDraw.line(0.1, 0.65, 0.6, 0.85);
        StdDraw.line(0.4, 0.35, 0.9, 0.55);
        StdDraw.line(0.4, 0.65, 0.9, 0.85);

        StdDraw.setPenRadius(0.004);
        Font font1 = new Font("Calibri", Font.BOLD, 40);
        StdDraw.setFont(font1);
        StdDraw.text(0.5, 0.28, "Cuboid");

        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.text(0.5, 0.20, "Base Length: " + BaseLength);

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.15, "Height: " + Height);

        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(0.5, 0.10, "Depth: " + Depth);

        Font font2 = new Font("Arial", Font.BOLD, 20);
        StdDraw.setFont(font2);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.text(0.5, 0.05, "Volume: " + Volume);
    }
}
