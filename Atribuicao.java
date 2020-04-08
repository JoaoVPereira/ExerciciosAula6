package ExerciciosAula6;

public class Atribuicao {
    //ATRIBUTOS
    private Professor professor;
    private Disciplina disciplina;

    //CONSTRUTOR
    public Atribuicao(Professor professor, Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
    }
    
    //METODOS DE ACESSO
    public Professor getProfessor(){
        return professor;
    }
    public Disciplina getDisciplina(){
        return disciplina;
    }

    //METODOS MODIFICADORES
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    //METODO getDados
    public String getDados(){
        return "Dados \n" + professor.getDados() + disciplina.getDados();
    }

}