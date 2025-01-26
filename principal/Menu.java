package principal;

import java.util.Scanner;

public class Menu {
    int opcao;
    int indiceNinjaBasico = 0;
    int quantidadeNinjasBasicos = 10;
    NinjaBasico[] ninjasBasicos = new NinjaBasico[quantidadeNinjasBasicos];
    int indiceNinjaAvancado = 0;
    int quantidadeNinjasAvancados = 5;
    NinjaAvancado[] ninjasAvancados = new NinjaAvancado[quantidadeNinjasAvancados];
    Scanner entrada = new Scanner(System.in);
    public void exibiMenuPrincipal() {
        do {
            System.out.println("----------|MENU PRINCIPAL|----------");
            System.out.println("1 - Criar um ninja básico.");
            System.out.println("2 - Criar um ninja avançado.");
            System.out.println("3 - Sair.");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuNinjaBasico();
                    break;
            }

        } while (opcao != 3);
    }

    public void exibirMenuNinjaBasico() {
        do {
            System.out.println("----------|MENU NINJA BÁSICO|----------");
            System.out.println("1 - Criar um ninja básico.");
            System.out.println("2 - Mostrar informações do ninja básico.");
            System.out.println("3 - Executar habilidade do ninja básico.");
            System.out.println("4 - Voltar.");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    criarNinjaBasico();
                    break;

                case 2:
                    int escolhido = exibirNinjasBasicos();
                    ninjasBasicos[escolhido].mostrarInformacoes();
                    break;

                case 3:
                    escolhido = exibirNinjasBasicos();
                    ninjasBasicos[escolhido].executarHabilidade();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    public void criarNinjaBasico() {
        entrada.nextLine();

        System.out.println("1 - Ninja Básico.");
        System.out.println("2 - Ninja Avançado.");
        System.out.print("Digite o tipo de ninja desejado: ");
        int tipoDesejado = entrada.nextInt();

        System.out.print("Digite o nome do ninja: ");
        String nome = entrada.nextLine();

        while (nome.isEmpty()) {
            System.out.println("Digite o nome do ninja!");
            System.out.print("Digite o nome do ninja: ");
            nome = entrada.nextLine();
        }

        System.out.print("Digite a idade do ninja: ");
        int idade = entrada.nextInt();

        while (idade < 0) {
            System.out.println("Digite uma idade válida!");
            System.out.print("Digite a idade do ninja: ");
            idade = entrada.nextInt();
        }

        TipoHabilidade tipoHabilidade = null;
        int tipo;
        do {
            System.out.println("1 - " + TipoHabilidade.TAIJUTSU);
            System.out.println("2 - " + TipoHabilidade.NINJUTSU);
            System.out.println("3 - " + TipoHabilidade.GENJUTSU);
            System.out.println("4 - " + TipoHabilidade.KATON);
            System.out.println("5 - " + TipoHabilidade.RINNEGAN);
            System.out.print("Escolha o tipo de habilidade do ninja: ");
            tipo = entrada.nextInt();

            switch (tipo) {
                case 1:
                    tipoHabilidade = TipoHabilidade.TAIJUTSU;
                    break;

                case 2:
                    tipoHabilidade = TipoHabilidade.NINJUTSU;
                    break;

                case 3:
                    tipoHabilidade = TipoHabilidade.GENJUTSU;
                    break;

                case 4:
                    tipoHabilidade = TipoHabilidade.KATON;
                    break;

                case 5:
                    tipoHabilidade = TipoHabilidade.RINNEGAN;
                    break;

                default:
                    System.out.println("Opção inválida!");

            }
        } while (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4 && tipo != 5);

        if (tipoDesejado == 2) {
            System.out.print("Digite a especialidade: ");
            String especialidade = entrada.nextLine();
            NinjaAvancado ninjaAvancado = new NinjaAvancado(nome, idade, tipoHabilidade, especialidade);

            ninjasAvancados[indiceNinjaAvancado] = ninjaAvancado;
            indiceNinjaAvancado++;

            System.out.println("O ninja avançado " + ninjaAvancado.nome + " foi criado com sucesso.");
        } else {
            NinjaBasico ninjaBasico = new NinjaBasico(nome, idade, tipoHabilidade);

            ninjasBasicos[indiceNinjaBasico] = ninjaBasico;
            indiceNinjaBasico++;

            System.out.println("O ninja básico " + ninjaBasico.nome + " foi criado com sucesso.");
        }
    }

    public int exibirNinjasBasicos() {
        System.out.println("----------|NINJAS BÁSICOS|----------");
        for (int i = 0; i < indiceNinjaBasico; i++) {
            System.out.println(i + " - " + ninjasBasicos[i].nome);
        }
        System.out.println("------------------------------------");
        System.out.print("Digite o ninja desejado: ");
        int escolha = entrada.nextInt();
        return escolha;
    }
}
