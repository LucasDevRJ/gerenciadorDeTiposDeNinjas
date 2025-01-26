package principal;

import java.util.Scanner;

public class Menu {
    int opcao;
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
            }

        } while (opcao != 3);
    }

    public void exibirMenuNinjaBasico() {
        do {
            System.out.println("----------|NINJA BÁSICO|----------");
            System.out.println("1 - Criar um ninja básico.");
            System.out.println("2 - Mostrar informações do ninja básico.");
            System.out.println("3 - Executar habilidade do ninja básico.");
            System.out.println("4 - Voltar.");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();
        } while (opcao != 4);
    }
}
