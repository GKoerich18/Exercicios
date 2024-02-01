package semana04.exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEscolar {


    public ArrayList<String> cursos = new ArrayList<>();

    public void cursosPadrao() {
        cursos.add("Aprendendo Back-End em JAVA!");
        cursos.add("Aprendendo Front-End em REACT!");
        cursos.add("Curso completo - Lógica de programação!");
        cursos.add("Inteligência artificial com PYTHON!");
    }

    public ArrayList<String> professores = new ArrayList<>();

    public void professoresPadrao() {
        professores.add("Gabriel Augustin");
    }

    public ArrayList<String> cursosConcluidos = new ArrayList<>();


    public void menu(Scanner entrada) {
        System.out.println("-----M E N U-----");
        System.out.println("1 - Listar Cursos:");
        System.out.println("2 - Adicionar Cursos:");
        System.out.println("3 - Remover Cursos:");
        System.out.println("4 - Listar Professores:");
        System.out.println("5 - Adicionar Professores:");
        System.out.println("6 - Remover Professores:");
        System.out.println("7 - Marcar curso como concluido:");
        System.out.println("8 - Listar cursos concluídos: ");
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
            case 7:
                concluirCurso(entrada);
                listarCursosConcluido();
                break;
            case 8:
                listarCursosConcluido();
                break;
            case 0:
                return;
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
        if (indice >= professores.size()) {
            System.out.println("Opção inválida, por favor tente outro índice");
            removerProfessor(entrada);
        } else {
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

    public void concluirCurso(Scanner entrada) {
        int indice;
        System.out.println("Digite qual curso você concluiu: ");
        indice = entrada.nextInt();
        if(indice >= cursos.size()){
            System.out.println("Opção inválida!");
            listarCursos();
            concluirCurso(entrada);
        }else {
            cursosConcluidos.add(cursos.get(indice));
            cursos.remove(indice);
            menu(entrada);
        }


    }

    public void listarCursosConcluido() {
        System.out.println("Os cursos concluídos são:");
        for (int i = 0; i < cursosConcluidos.size(); i++) {
            String cursos = cursosConcluidos.get(i);
            System.out.println(i + " - " + cursos);
        }
    }


    public static void main(String[] args) {
        System.out.println("Bem vindo ao Sistema-Escolar GK!");

        SistemaEscolar Escola = new SistemaEscolar();

        Scanner entrada = new Scanner(System.in);

        Escola.cursosPadrao();
        Escola.professoresPadrao();


        Escola.menu(entrada);


    }
}
