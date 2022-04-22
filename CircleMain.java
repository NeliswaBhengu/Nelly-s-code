/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.driver.s220646651;
import za.ac.wsu.s220646651.Circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Circle obj2 = new Circle();
        Circle obj3 = new Circle();

        obj1.setRadius(5);
        obj1.setX(4);
        obj1.setY(10);

        obj2.setRadius(10.3);
        obj2.setY(15);
        obj2.setX(10);


        obj3.setRadius(3);
        obj3.setY(6);
        obj3.setX(20);

        System.out.println("****out put *******");

        System.out.println("Test for Circle 1 object");

        System.out.println("Radius :" + obj1.getRadius());
        System.out.println("Center X:" + obj1.getX());
        System.out.println("Center y:" + obj1.getY());
        System.out.println("Area : " + obj1.calculateArea());
        System.out.println("Circumference: "+obj1.calculateCircumference());
        System.out.println("Diameter" + obj1.calculateDiameter());

        System.out.println("Circle 2 out put");

        System.out.println("Radius :" + obj2.getRadius());
        System.out.println("Center X:" + obj2.getX());
        System.out.println("Center y:" + obj2.getY());

        System.out.println("Area : " + obj2.calculateArea());
        System.out.println("Circumference: "+obj2.calculateCircumference());
        System.out.println("Diameter" + obj2.calculateDiameter());


        System.out.println("Circle 3 information");

        System.out.println("Radius :" + obj3.getRadius());
        System.out.println("Center X:" + obj3.getX());
        System.out.println("Center y:" + obj3.getY());

        System.out.println("Area : " + obj3.calculateArea());
        System.out.println("Circumference: "+obj3.calculateCircumference());
        System.out.println("Diameter" + obj3.calculateDiameter());

    }
}
    

