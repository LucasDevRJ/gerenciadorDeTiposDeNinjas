package principal;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;
    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos de idade.");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando a minha habilidade " + this.habilidade + "!!!");
    }
}
