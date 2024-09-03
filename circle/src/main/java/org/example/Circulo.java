package org.example;

public class Circulo {

    float radio;
    float PI = 3.141592F;
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float calcularArea(){
        return (radio * radio) * PI;
    }

    public float calcularPerimetro(){
        return 2 * PI * radio;
    }

    public String mostrarDetalles(){
        return "Circulo\t Radio = " + radio + " Perimetro = " + calcularPerimetro() + " Area = " + calcularArea();
    }


    public static void main(String[] args) {
        Circulo circulo = new Circulo(45);
        System.out.println(circulo.mostrarDetalles());
    }
}