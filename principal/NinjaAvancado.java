package principal;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Olá, meu nome é " + this.nome + ", tenho " + this.idade + " anos de idade e minha especialidade é " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando a minha habilidade " + this.habilidade + " aprimorada pela minha especialidade de " + this.especialidade);
    }
}
