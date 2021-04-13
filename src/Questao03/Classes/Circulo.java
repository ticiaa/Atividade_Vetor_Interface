package Questao03.Classes;

import Questao03.Interface.FormaGeometrica;

public class Circulo implements FormaGeometrica {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
         return Math.PI * (raio * raio);
    }

    @Override
    public String explicaCalculo() {
        return "A área de um círculo é dada pelo produto de π e do quadrado do raio: Área = π·r².";
    }
    

}
