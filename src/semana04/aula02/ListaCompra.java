package semana04.aula02;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class ListaCompra {
    private static List<String> inicializacaoLista() {
        List<String> listaCompras = new ArrayList<>();

        listaCompras.add("Feijão");
        listaCompras.add("Arroz");
        listaCompras.add("Batata");
        listaCompras.add("Macarrão");
        listaCompras.add("Requeijão");
        listaCompras.add("Leite");
        listaCompras.add("Limão");
        listaCompras.add("Laranja");
        listaCompras.add("Goiaba");
        listaCompras.add("Manjericão");

        return listaCompras;
    }

    private static void verLista(List<String> listaCompras) {
        for (int i = 0; i < listaCompras.size(); i++) {
            String item = listaCompras.get(i);
            System.out.println(i + " - " + item);
        }
    }

    private static void adicionarLista(Scanner entrada, List<String> listaCompras) {
        System.out.print("Informe o item: ");
        String item = entrada.next();
        listaCompras.add(item);


    }

    private static void removerItemLista(Scanner entrada, List<String> listaCompras) {
        System.out.println("Digite qual item você deseja remover: ");
        int indice = entrada.nextInt();
        if (listaCompras.size() <= indice) {
            System.out.println("Item não existe!");
        } else {
            listaCompras.remove(indice);
        }
    }

    private static void menu(Scanner entrada, List<String> listaCompras) {
        System.out.println("------M E N U------");
        System.out.println("1 - Listar itens");
        System.out.println("2 - Adicionar itens");
        System.out.println("3 - Remover itens");
        System.out.println("4 - Encerrar lista");
        System.out.print("O que você deseja? ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                verLista(listaCompras);
                break;
            case 2:
                adicionarLista(entrada, listaCompras);
                verLista(listaCompras);
                break;
            case 3:
                removerItemLista(entrada, listaCompras);
                verLista(listaCompras);
                break;
            case 4:
                System.out.println("Lista encerrada!");
                return;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if(opcao != 4) menu(entrada, listaCompras);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> listaCompras = inicializacaoLista();

        menu(entrada, listaCompras);



    }


}