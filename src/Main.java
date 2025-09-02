import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turma turmapoo = new Turma("Turma Allen");
        while (true) {
            System.out.println("----Sistema Icev----");
            System.out.println("1.Adicionar Aluno");
            System.out.println("2.listar Alunos");
            System.out.println("3.Buscar Aluno");
            System.out.println("4.Excluir Aluno");
            System.out.println("5.Cálcular média da turma");
            System.out.println("6.Sair");
            System.out.println("Escolha uma opção:");

            int escola = sc.nextInt();
            sc.nextLine();
            switch (escola) {
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do aluno: ");
                    int matricula = sc.nextInt();
                    System.out.println("Digite a nota do aluno");
                    double nota = sc.nextDouble();

                    sc.nextLine();

                    Aluno novoAluno = new Aluno(nome, matricula, nota);
                    turmapoo.adicionarAluno(novoAluno);
                    break;

                case 2:
                    System.out.println("---Lista de alunos---");
                    turmapoo.ListarAlunos();
                    break;

                case 3:
                    System.out.println("Digite a matrícula do Aluno que deseja buscar: ");
                    int matriculaBusca = sc.nextInt();
                    sc.nextLine();

                    Aluno alunoEncontrado = turmapoo.buscarAlunoPorMatricula(matriculaBusca);
                    if (alunoEncontrado != null) {
                        System.out.println("--- Aluno Encontrado ---");

                        alunoEncontrado.exibirinfo();
                    } else {
                        System.out.println("Aluno com a matrícula" +  matriculaBusca  +  "não foi encontrada");
                    }

                    break;

                case 4:

                    System.out.println("Digite a matrícula do aluno que deseja remover: ");

                    int matriculaRemover = sc.nextInt();
                    sc.nextLine();

                    turmapoo.removerAluno(matriculaRemover);
                    break;

                case 5:
                    double mediaDaturma = turmapoo.calcularMedia();
                    System.out.printf("A média da turma é: %.2f\n", mediaDaturma);
                    break;
                case 6:
                    System.out.println("Saindo");
                    sc.close();
                    return;

                default:
                    System.out.println("opção inválida! Por favor , tente novamente");
                    break;
            }
        }

    }
}
