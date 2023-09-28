package mediamodelo05;
public class NotasAluno {
    private Aluno alunos;
    private NotaDisciplina[] disciplina;
    
    
    public NotasAluno () {
        alunos = new Aluno(); 
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public NotaDisciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(NotaDisciplina[] disciplina) {
        this.disciplina = disciplina;
    }

}
