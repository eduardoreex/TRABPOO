import java.util.ArrayList;

public class Turma {

    private String nometurma;
    ArrayList<Aluno> alunos;

    public Turma(String nometurma) {
        this.nometurma = nometurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println("Aluno" + aluno.getNome() + "adicionado com sucesso");
    }

    public void ListarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhuma aluno encontrado");
            return;
        }
        System.out.println("Alunos da turma: " + this.nometurma);

        for (Aluno aluno : this.alunos) {
            aluno.exibirinfo();
        }
    }
    public Aluno buscarAlunoPorMatricula (int matricula){
        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }
    public void removerAluno(int matricula) {
        Aluno alunopararemover = buscarAlunoPorMatricula(matricula);
        if (alunopararemover != null) {
            this.alunos.remove(alunopararemover);
            System.out.println("Aluno " + alunopararemover.getNome() + " removido com sucesso");
        } else {
            System.out.println("Aluno com a matrícula" + matricula + " não encontrada");
        }
    }

    public double calcularMedia() {
        if(alunos.isEmpty()) {
            return 0.0;
        }
        double somaDasNotas = 0.0;
        for (Aluno aluno : this.alunos) {
            somaDasNotas += aluno.getNota();
        }
        return somaDasNotas / this.alunos.size();
    }
}
