package ExerciciosAula6;

public class Disciplina {
    //ATRIBUTOS
    private String nome2;
    private boolean pratica;
    private Professor professor;

    //CONSTRUTOR
    public Disciplina(String nome, boolean pratica, Professor professor){
        this.nome2 = nome;
        this.pratica = pratica;
        this.professor = professor;
    }

    //METODOS DE ACESSO
    public String getNome(){
        return nome2;
    }
    public boolean getPratica(){
        return pratica;
    }
    public Professor getProfessor(){
        return professor;
    }

    //METODOS MODIFICADORES
    public void setNome(String nome){
        this.nome2 = nome;
    }
    public void setIdade(boolean pratica){
        this.pratica = pratica;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    //METODO getDados
    public String getDados(){
        return "\nDisciplina [Disciplina:"+ nome2 + "| Pratica:" + pratica + "]";
    }

}