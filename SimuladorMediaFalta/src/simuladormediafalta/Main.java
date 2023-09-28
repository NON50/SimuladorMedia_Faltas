package mediamodelo05;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI ();
        Aluno aluno = new Aluno();
        NotasAluno notasAluno = new NotasAluno ();
        
        aluno.setNome(ui.pedirTexto("Nome: "));
        aluno.setChamada(ui.pedirInt("Chamada: "));
        ui.pedirTexto("");
        aluno.setCurso(ui.pedirTexto("Curso: "));
        aluno.setTurma(ui.pedirTexto("Turma: "));
        ui.pularLinha();
        
        int qtd = ui.pedirInt("Quantas discipinas na grade: ");
        NotaDisciplina[] disciplina = new NotaDisciplina[qtd]; 
        
        for (int i = 0; i < disciplina.length; i++){
            NotaDisciplina notas = new NotaDisciplina ();
            ui.pedirTexto("");
            notas.setDisciplina(ui.pedirTexto("Disciplina: "));
            notas.setMedia(ui.pedirDouble("Média: "));
            notas.setFaltas(ui.pedirInt("Faltas: "));
            
            disciplina [i] = notas;
            ui.pularLinha();
        }
        
        notasAluno.setAlunos(aluno);
        notasAluno.setDisciplina(disciplina);
        
        Boletim boletim = new Boletim();
        Resultado result = boletim.avaliar(notasAluno);
        ui.situacaoAluno(result);
    }
    
}
