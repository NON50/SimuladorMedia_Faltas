package mediamodelo05;

public class Resultado {

    private Aluno aluno;
    private NotaDisciplina[] disciplina;

    private String situacao;
    private int qtdAprovacoes;
    private int qtdReprovacoes;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public NotaDisciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(NotaDisciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getQtdAprovacoes() {
        return qtdAprovacoes;
    }

    public void setQtdAprovacoes(int qtdAprovacoes) {
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public int getQtdReprovacoes() {
        return qtdReprovacoes;
    }

    public void setQtdReprovacoes(int qtdReprovacoes) {
        this.qtdReprovacoes = qtdReprovacoes;
    }

}
