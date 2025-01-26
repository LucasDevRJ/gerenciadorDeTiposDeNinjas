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

    }

    @Override
    public void executarHabilidade() {

    }
}
