package Questao03.Classes;

import Questao03.Interface.FormaGeometrica;

public class Quadrado implements FormaGeometrica {
    private double lado;

    @Override
    public double calcularArea() {
       double area = 0;
        area = lado * lado;

        return area;
    }

    @Override
    public String explicaCalculo() {
        return "Área quadrangular = lado * lado. \nO cálculo da área é largura * altura, como um quadrado têm todos os seus lados do mesmo tamanho, simplesmente calcule LADO * LADO. ";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
