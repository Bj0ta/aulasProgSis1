public class Pessoa {
    String nome;
    int idade;
    float altura;

public Pessoa(String nome, int idade, float altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
}
public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
}
public static void main(String[]args){
    Pessoa p1 = new Pessoa("Luciana Roberto",30,1.70f);
    Pessoa p2 = new Pessoa("Fernanda Fernandes",28,1.69f);
    p1.exibirInformacao();
    p2.exibirInformacao();
}
public void exibirInformacao(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Altura: " + this.altura);
} 
}
