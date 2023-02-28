import java.util.Scanner;

class Rectangle    {
    int m_width;
    int m_height;

    //using constructor to set dimensions of Rectangle
    public Rectangle(int width, int height)    {
        m_width = width;
        m_height = height;
    }

    public int getArea()    {
        return m_width * m_height;
    }
}
//Square class extends Rectangle class to find area of Square
class Square extends Rectangle {
    public Square(int sideOfSqauare) {
        super(sideOfSqauare, sideOfSqauare);
    }
}

class Area    {
    public static int calculateArea(Rectangle dimensions)    {
        return dimensions.getArea();
    }

    public static void main(String[] args)    {
        System.out.println("Choose 1 for area of rectangle: ");
        System.out.println("Choose 2 for area of square: ");
        System.out.println("Enter your choice");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch(choice)    {
            case 1:
                System.out.println("Enter length of Rectangle: ");
                Scanner rectangleLength = new Scanner(System.in);
                int length = rectangleLength.nextInt();
                System.out.println("Enter breadth of Rectangle: ");
                Scanner rectangleBreadth = new Scanner(System.in);
                int breadth = rectangleBreadth.nextInt();
                Rectangle dimensions = new Rectangle(length, breadth);
                System.out.println("Area of Rectangle = " + calculateArea(dimensions));
                break;

            case 2:
                System.out.println("Enter length of side of Square: ");
                Scanner squareEdge = new Scanner(System.in);
                int side = squareEdge.nextInt();
                Square squareSide = new Square(side);
                System.out.println("Area of Square = " + calculateArea(squareSide));
                break;

            default:
                System.out.println("choose either 1 or 2");
                break;
        }
    }
}