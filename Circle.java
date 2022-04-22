/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.wsu.s220646651;

/**
 *
 * @author ACER
 */

public class Circle {

    double radius;
    int x;
    int y;

   public double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public double calculateDiameter(){
        return 2*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius< 0){
            radius = 0;
        }
        else {
            this.radius = radius;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
   
