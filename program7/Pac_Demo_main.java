package shape;

public class Pac_Demo_main {
    public static void main(String[] args) {
        square square=new square();
        Triangle triangle=new Triangle();
        circle circle=new circle();
        square.getData((float)5.5);
        System.out.println("The area of square is:"+square.area());
        triangle.getData(20.56, 23.90);
        System.out.println("The area of triangle is:"+triangle.area());
        circle.getData(5.5);
        System.out.println("The area of circle is:"+circle.area());
    }
}
