package mediamodelo05;

public class Boletim {

    public Resultado avaliar(NotasAluno notasAluno) {
        int qtdAprovacoes = 0;
        int qtdReprovacoes = 0;

        for (NotaDisciplina disciplina : notasAluno.getDisciplina()) {
            String situacao = verificarSituacao(disciplina.getMedia(), disciplina.getFaltas());
            if (situacao.equals("Aprovado")) {
                qtdAprovacoes += 1;
            } else {
                qtdReprovacoes += 1;
            }
        }

        Resultado result = new Resultado();
        result.setAluno(notasAluno.getAlunos());
        result.setDisciplina(notasAluno.getDisciplina());
        result.setQtdAprovacoes(qtdAprovacoes);
        result.setQtdReprovacoes(qtdReprovacoes);

        if (qtdReprovacoes >= 1) {
            result.setSituacao("Reprovado");
        } else {
            result.setSituacao("Aprovado");
        }

        return result;

    }

    private String verificarSituacao(double media, int faltas) {
        String situacao = "";
        
        if (media < 6.0)
            situacao = "DP por Nota";
        else if (faltas > 4)
            situacao = "DP por Falta";
        else
            situacao = "Aprovado";
        
        return situacao;
    }
}
