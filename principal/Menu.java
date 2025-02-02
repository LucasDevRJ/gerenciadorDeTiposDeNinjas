package principal;

import java.util.Scanner;

public class Menu {
    int quantidadeNinjasBasicos = 10;
    int indiceNinjaBasico = 0;
    int[] indicesNinjasBasicos = new int[quantidadeNinjasBasicos];
    NinjaBasico[] ninjasBasicos = new NinjaBasico[quantidadeNinjasBasicos];
    int quantidadeNinjasAvancados = 5;
    int indiceNinjaAvancado = 0;
    int[] indicesNinjasAvancados = new int[quantidadeNinjasAvancados];
    NinjaAvancado[] ninjasAvancados = new NinjaAvancado[quantidadeNinjasAvancados];
    Scanner entrada = new Scanner(System.in);
    boolean programaFinalizado = false;

    public void exibiMenuPrincipal() {
        int opcao;
        do {
            System.out.println("----------|MENU PRINCIPAL|----------");
            System.out.println("1 - Criar um ninja.");
            System.out.println("2 - Sair.");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuNinja();
                    break;

                case 2:
                    finalizarPrograma();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (!programaFinalizado);
    }

    public void exibirMenuNinja() {
        int opcao;
        do {
            System.out.println("----------|MENU NINJA|----------");
            System.out.println("1 - Criar um ninja básico ou avançado.");
            System.out.println("2 - Mostrar informações do ninja básico ou avançado.");
            System.out.println("3 - Executar habilidade do ninja básico ou avançado.");
            System.out.println("4 - Voltar.");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    criarNinjaBasico();
                    break;

                case 2:
                    exibiInformacoesDoNinjaOuExecutaHabilidade(true);
                    break;

                case 3:
                    exibiInformacoesDoNinjaOuExecutaHabilidade(false);
                    break;

                case 4:
                    exibiMenuPrincipal();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    public void finalizarPrograma() {
        programaFinalizado = true;
        System.out.println("Programa finalizado.");
    }

    public void criarNinjaBasico() {
        entrada.nextLine();

        System.out.println("1 - Ninja Básico.");
        System.out.println("2 - Ninja Avançado.");
        System.out.print("Digite o tipo de ninja desejado: ");
        int tipoDesejado = entrada.nextInt();

        while (tipoDesejado != 1 && tipoDesejado != 2) {
            System.out.println("Digite 1 ou 2!");
            System.out.print("Digite o tipo de ninja desejado: ");
            tipoDesejado = entrada.nextInt();
        }

        entrada.nextLine();

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

        entrada.nextLine();

        if (tipoDesejado == 2) {
            System.out.print("Digite a especialidade: ");
            String especialidade = entrada.nextLine();

            while (especialidade.isEmpty()) {
                System.out.println("Digite a especialidade!");
                System.out.print("Digite a especialidade: ");
                especialidade = entrada.nextLine();
            }

            NinjaAvancado ninjaAvancado = new NinjaAvancado(nome, idade, tipoHabilidade, especialidade);

            ninjasAvancados[indiceNinjaAvancado] = ninjaAvancado;
            indicesNinjasAvancados[indiceNinjaAvancado] = indiceNinjaAvancado;
            indiceNinjaAvancado++;

            System.out.println("O ninja avançado " + ninjaAvancado.nome + " foi criado com sucesso.");
        } else {
            NinjaBasico ninjaBasico = new NinjaBasico(nome, idade, tipoHabilidade);

            ninjasBasicos[indiceNinjaBasico] = ninjaBasico;
            indicesNinjasBasicos[indiceNinjaBasico] = indiceNinjaBasico;
            indiceNinjaBasico++;

            System.out.println("O ninja básico " + ninjaBasico.nome + " foi criado com sucesso.");
        }
    }

    public int exibirTiposDeNinjas() {
        int tipoNinja;
        do {
            System.out.println("1 - Ninja Básico.");
            System.out.println("2 - Ninja Avançado.");
            System.out.print("Digite o tipo de ninja: ");
            tipoNinja = entrada.nextInt();
        } while (tipoNinja != 1 && tipoNinja != 2);
        return tipoNinja;
    }

    public int exibirNinjas(int tipoDeNinjaEscolhido) {
        int escolha;
        boolean escolhaValida = false;
        if (tipoDeNinjaEscolhido == 1) {
            do {
                System.out.println("----------|NINJAS BÁSICOS|----------");
                for (int i = 0; i < indiceNinjaBasico; i++) {
                    System.out.println(i + " - " + ninjasBasicos[i].nome);
                }
                System.out.println("------------------------------------");
                System.out.print("Digite o ninja desejado: ");
                escolha = entrada.nextInt();

                for (int i = 0; i < indiceNinjaBasico; i++) {
                    if (escolha == indicesNinjasBasicos[i]) {
                        escolhaValida = true;
                    }
                }
            } while (!escolhaValida);

        } else {
            do {
                System.out.println("----------|NINJAS AVANÇADOS|----------");
                for (int i = 0; i < indiceNinjaAvancado; i++) {
                    System.out.println(i + " - " + ninjasAvancados[i].nome);
                }
                System.out.println("------------------------------------");
                System.out.print("Digite o ninja desejado: ");
                escolha = entrada.nextInt();

                for (int i = 0; i < indiceNinjaAvancado; i++) {
                    if (escolha == indicesNinjasAvancados[i]) {
                        escolhaValida = true;
                    }
                }
            } while (!escolhaValida);

        }
        return escolha;
    }

    public void exibiInformacoesDoNinjaOuExecutaHabilidade(boolean querVerInformacoes) {
        int tipoNinjaEscolhido = exibirTiposDeNinjas();
        if (tipoNinjaEscolhido == 1) {
            if (indiceNinjaBasico > 0) {
                int escolhido = exibirNinjas(tipoNinjaEscolhido);
                if (querVerInformacoes) {
                    ninjasBasicos[escolhido].mostrarInformacoes();
                } else {
                    ninjasBasicos[escolhido].executarHabilidade();
                }
            } else {
                System.out.println("Não há ninjas básicos cadastrados.");
            }
        } else {
            if (indiceNinjaAvancado > 0) {
                int escolhido = exibirNinjas(tipoNinjaEscolhido);
                if (querVerInformacoes) {
                    ninjasAvancados[escolhido].mostrarInformacoes();
                } else {
                    ninjasAvancados[escolhido].executarHabilidade();
                }
            } else {
                System.out.println("Não há ninjas avançados cadastrados.");
            }
        }
    }
}
