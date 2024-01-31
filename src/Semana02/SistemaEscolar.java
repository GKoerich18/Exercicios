package Semana02;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {


    public ArrayList<String> cursos = new ArrayList<>();
    public ArrayList<String> professores = new ArrayList<>();

    public void menu(Scanner entrada) {
        System.out.println("Bem vindo ao Sistema-Escolar GK!");
        System.out.println("-----M E N U-----");
        System.out.println("1 - Listar Cursos:");
        System.out.println("2 - Adicionar Cursos:");
        System.out.println("3 - Remover Cursos:");
        System.out.println("4 - Listar Professores:");
        System.out.println("5 - Adicionar Professores:");
        System.out.println("6 - Remover Professores:");
        System.out.println("0 - Encerrar o programa:");
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                listarCursos();
                menu(entrada);
                break;
            case 2:
                adicionarCurso(entrada);
                listarCursos();
                menu(entrada);
                break;
            case 3:
                removerCurso(entrada);
                break;
            case 4:
                listarProfessores();
                menu(entrada);
                break;
            case 5:
                adicionarProfessor(entrada);
                listarProfessores();
                menu(entrada);
                break;
            case 6:
                removerProfessor(entrada);
            case 0: return;
            default:
                System.out.println("Opção inválida, por favor tente outra!");
                menu(entrada);


        }


    }

    public void listarProfessores() {
        System.out.println("Os professores inseridos são: ");
        for (int i = 0; i < professores.size(); i++) {
            String professor = professores.get(i);
            System.out.println(i + " - " + professor);
        }
    }

    public void listarCursos() {
        System.out.println("Os cursos inseridos são: ");
        for (int i = 0; i < cursos.size(); i++) {
            String curso = cursos.get(i);
            System.out.println(i + " - " + curso);
        }
    }

    public void adicionarProfessor(Scanner entrada) {
        System.out.println("Digite o nome do professor que você quer inserir: ");
        String professorInserido = entrada.next();
        professores.add(professorInserido);
    }

    public void adicionarCurso(Scanner entrada) {
        System.out.println("Digite qual curso você quer inserir: ");
        String cursoInserido = entrada.next();
        cursos.add(cursoInserido);

    }
    public void removerProfessor(Scanner entrada) {
        System.out.println("Digite qual professor você deseja remover: ");
        int indice = entrada.nextInt();
        if (indice >= professores.size()){
            System.out.println("Opção inválida, por favor tente outro índice");
            removerProfessor(entrada);
        }else{
            professores.remove(indice);
            listarProfessores();
            menu(entrada);
        }
    }

    public void removerCurso(Scanner entrada) {
        System.out.print("Digite qual curso você deseja remover: ");
        int indice = entrada.nextInt();
        if (indice >= cursos.size()) {
            System.out.println("Opção inválida, por favor tente outro índice!");
            removerCurso(entrada);
        } else {
            cursos.remove(indice);
            listarCursos();
            menu(entrada);
        }
    }


    public static void main(String[] args) {
        SistemaEscolar Escola = new SistemaEscolar();

        Scanner entrada = new Scanner(System.in);

        byte escolha;

        Escola.menu(entrada);


    }
}
