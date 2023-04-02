/*
Exercício 02 : Classe Livro

Crie uma classe chamada "Livro" com os seguintes atributos
públicos: título, autor, editora e número de páginas.
Crie um método chamado "exibirDetalhes" que imprima todas as informações do livro.
* */

public class Livro {
    // atributos
    public  String title;
    public  String author;
    public  String publishingCompany;
    public int pageNumber;

    // metodo da classe exibirDetalhes()

    public void exibirDetalhes(){
        System.out.println("Titulo: "+title);
        System.out.println("Autor: "+ author);
        System.out.println("Editora: "+ publishingCompany);
        System.out.println("Páginas: "+pageNumber);

    }

    public static void main(String[] args) {
       Livro dataLivro = new Livro();
        dataLivro.title= "O Segredo";
       dataLivro.author = "Rhonda Byrne";
       dataLivro.publishingCompany = "Sextante";
       dataLivro.pageNumber= 272;

       dataLivro.exibirDetalhes();
    }
}
