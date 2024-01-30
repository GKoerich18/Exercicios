package Semana02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {


    public ArrayList<String> cursos = new ArrayList<>();
    public ArrayList<String> professores = new ArrayList<>();

    public void listarProfessores(){
        for (int i = 0; i < professores.size(); i++){
            String professor = professores.get(i);
            System.out.println("Os professores inseridos são: " + i + " - " + professor);
        }
    }
    public void listarCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            String curso = cursos.get(i);
            System.out.println("Os cursos inseridos são: " + i + " - " + curso);
        }
    }
public void adicionarProfessor(String professorInserido){
        professores.add(professorInserido);
}
    public void adicionarCurso(String cursoInserido) {
        cursos.add(cursoInserido);

    }


    public static void main(String[] args) {
        Exercicio01 Escola = new Exercicio01();

        Scanner entrada = new Scanner(System.in);

        byte escolha;

        System.out.println("Bem vindo ao Sistema Escolar!");

        do {
            System.out.println("Você deseja adicionar 1 - Cursos || 2 - Professores || 3 - Sair:");
            escolha = entrada.nextByte();

            switch (escolha) {
                case 1:
                    System.out.println("Digite qual curso você quer inserir: ");
                    Escola.adicionarCurso(entrada.next());
                    Escola.listarCursos();
                    break;
                case 2:
                    System.out.println("Digite qual professor você quer inserir: ");
                    Escola.adicionarProfessor(entrada.next());
                    Escola.listarProfessores();
                    break;
                case 3:
                    Escola.listarProfessores();
                    Escola.listarCursos();
                    break;
                default: String opcaoInvalida = "Opção invalida, tente (1) (2) ou (3)";
                    System.out.println(opcaoInvalida);
            }


        }while(escolha != 3);







    }
}
