package com.numeros;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese base del rectangulo");
        int  a = scanner.nextInt();
        System.out.println("ingrese altura del rectangulo");
        int b = scanner.nextInt();

        Rectangulo aRect = new Rectangulo();

        aRect.calcularArea(a, b);
        aRect.calcularPerimetro(a, b);

    }
}
