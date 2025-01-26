package principal;

import java.util.Scanner;

public class Menu {

    Scanner entrada = new Scanner(System.in);
    public void exibiMenuPrincipal() {
        int opcao;
        do {
            System.out.println("----------|MENU PRINCIPAL|----------");
            System.out.println("1 - Criar um ninja básico.");
            System.out.println("2 - Criar um ninja avançado.");
            System.out.println("3 - Sair.");
            System.out.println("-------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();
        } while (opcao != 3);
    }
}
