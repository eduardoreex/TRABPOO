public class Aluno {
    private String nome;
    private  int matricula;
    private  double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void exibirinfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota: " + this.nota);
    }

}

