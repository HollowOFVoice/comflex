package org.example;

import java.util.Objects;

public class Complex {
    int x;
    int y;

    int x2;

    int y2;


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Complex() {
    }

    public Complex(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }


    public String str() {

        return "Результат метоода str: " + getX() + "+" + getY() + "i";
    }

    public Complex add() {
        System.out.println("Результат метода add: ");
        return getX() +getX2() ;

    }

    public int  sub(){
        System.out.println("Результат метода sub: ");
        return getX()-getY();
    }

    public int  mul() {
        System.out.println("Результат метода mul: ");
        return getX()*getY();
    }

    public int  div() {
        System.out.println("Результат метода div: ");
        return getX()/getY();
    }

    public double abs() {

        System.out.println("Результат метода abs: ");
        return Math.sqrt(getX()*getY());
    }


    public boolean equal() {
     boolean result = false;
        System.out.println("Результат метода equal: ");
if(getX()==getY()) result=true;
return result;

     //System.out.println("true");
        //else System.out.println("false");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return x == complex.x && y == complex.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
