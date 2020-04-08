package ExerciciosAula6;
import javax.swing.*;

public class TesteAtribuicao {
    public static void main(String...x){
        String nome = "Ana";
        int idade = 25;

        String nome2 = " Matematica";
        boolean pratica = false;

        Professor professor = new Professor(nome, idade);
        Disciplina disciplina = new Disciplina(nome2, pratica, professor);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
        

    }

}