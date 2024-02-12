package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Complex complex = new Complex(5,5);
        System.out.println(  complex.str());

        System.out.println(complex.add());

        System.out.println( complex.sub());

        System.out.println( complex.mul());

        System.out.println( complex.div());

        System.out.println( complex.abs());

        System.out.println(complex.equal());
        }
    }
