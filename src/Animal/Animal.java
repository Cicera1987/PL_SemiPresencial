/*
Exercício 03 : Classe Animal
Crie uma classe chamada "Animal" com os seguintes atributos
públicos: nome, idade e espécie. Crie um método chamado "emitirSom"
que imprima uma mensagem indicando que o animal está emitindo um som.
Crie também um método chamado "dormir" que imprima uma mensagem indicando que o animal está dormindo.*/


public class Animal {
  // atributos da classe
    public String name;
    public String species;
    public int age;

    // metodos da classe emitirSom() e dormir()
    public void emitirSom(){
        System.out.println(name + "está emitindo um som");
    }
    public  void  dormir(){
        System.out.println(name + "esta dormindo");
    }

    public static void main(String[] args) {
        ///Imprimindo resultado
        Animal aminal_01 = new Animal();
        aminal_01.name = "Gato ";
        aminal_01.species = "Felino";
        aminal_01.age = 3;

        aminal_01.emitirSom();
        aminal_01.dormir();
    }
  
}
