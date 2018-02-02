package com.numeros;

public class Rectangulo {

    int base;
    int altura;

    public void calcularArea(int base, int altura) {
        int area;
        area = altura * base;
        System.out.println("El area es: "+area);
    }

    public void calcularPerimetro(int base, int altura){
        int perimetro;
        perimetro = 2 * base + altura;
        System.out.println("El perimetro es: "+ perimetro);

    }
}
