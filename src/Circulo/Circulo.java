/*

Exercício 01 : Classe Círculo

Crie uma classe chamada "Círculo" com um atributo público chamado "raio".
Crie um método chamado "calcularArea" que retorne a área do círculo.
Crie outro método chamado "calcularPerimetro" que retorne o perímetro do círculo.
* */

public class Circulo {
    private double raio;

    public  Circulo(double raio){this.raio = raio;}
    public double calcularArea(){return Math.PI * raio * raio;}
    public  double calcularPerimetro(){return  2 * Math.PI * raio;}
}
