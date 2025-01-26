package principal;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;
    public NinjaBasico(String nome, int idade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos de idade.");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando a minha habilidade " + this.tipoHabilidade + "!!!");
    }
}
