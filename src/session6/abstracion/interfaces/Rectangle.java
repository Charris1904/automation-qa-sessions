package session6.abstracion.interfaces;

public class Rectangle implements IShape {

    int length, width;

    Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override public void draw()
    {
        System.out.println("Rectangle has been drawn ");
    }

    @Override public double area()
    {
        return (double)(length * width);
    }
}
