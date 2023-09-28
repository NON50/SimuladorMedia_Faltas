package mediamodelo05;
import java.util.*;

public class UI {
    static Scanner digite = new Scanner(System.in);
    
    public void imprima(String msg, Object... values){
        System.out.printf(msg + "\n", values);
    }
    public void pularLinha() {
        System.out.println();
    }
    public double pedirDouble(String msg, Object... values) {
        System.out.printf(msg, values);
        double valor = digite.nextDouble();
        return valor;
    }

    public int pedirInt(String msg, Object... values) {
        System.out.printf(msg, values);
        int valor = digite.nextInt();
        return valor;
    }

    public String pedirTexto(String msg, Object... values) {
        System.out.printf(msg, values);
        String valor = digite.nextLine();
        return valor;
    }
    
    public void situacaoAluno (Resultado result){
        pularLinha();
        System.out.println("=========================");
        System.out.println("        Boletim!");
        System.out.println("=========================");
        
        pularLinha();
        System.out.println("=========================");
        System.out.println("        Disciplinas");
        System.out.println("=========================");
        
        for (NotaDisciplina notas : result.getDisciplina()){
            imprima("%s, Média: %.1f, Faltas: %d", 
                    notas.getDisciplina(),
                    notas.getMedia(), 
                    notas.getFaltas());
        }
        
        pularLinha();
        pularLinha();
        System.out.println("=========================");
        System.out.println("    Resultado Final");
        System.out.println("=========================");
        imprima("Qtd. Aprovações: %d ", result.getQtdAprovacoes());
        imprima("Qtd. Reprovações: %d ", result.getQtdReprovacoes());
        imprima("Situação Final: %s ", result.getSituacao());

        System.out.println();
        System.out.println("=========================");
        System.out.println("          FIM");
        System.out.println("=========================");
        System.out.println();
        System.out.println();
    }

}
    
