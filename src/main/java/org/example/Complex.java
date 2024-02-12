package org.example;

public class Complex {
    int x;
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Complex() {
    }

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String str() {

        return "Результат метоода str: " + getX() + "+" + getY() + "i";
    }

    public int add() {
        System.out.println("Результат метода add: ");
        return getX() + getY();
    }

    public int  sub(){
        System.out.println("Результат метода sub: ");
        return getX()-getY();
    }

    public int  mul() {
        System.out.println("Результат метода mul: ");
        return getX()*getY();
    }

    public double  div() {
        System.out.println("Результат метода div: ");
        return getX()/getY();
    }

    public double abs() {

        System.out.println("Результат метода abs: ");
        return Math.sqrt(getX()*getX() + getY()*getY());
    }


    public boolean equal() {
     boolean result = false;
        System.out.println("Результат метода equal: ");
if(getX()==getY()) result=true;
return result;

     //System.out.println("true");
        //else System.out.println("false");
    }
}
