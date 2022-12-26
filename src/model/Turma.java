package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Turma {

    private String codigo;
    private String sala;
    private LocalDateTime horario;
    private Professor professor;

    private List<Aluno> alunos = new ArrayList<>();

//    private List<Aluno> alunos;


    public Turma(String codigo, String sala, LocalDateTime horario, Professor professor) {
        this.codigo = codigo;
        this.sala = sala;
        this.horario = horario;
        this.professor = professor;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String estaAberta(LocalDateTime horario){
        if(this.getHorario().getHour()==horario.getHour()) {
            return "sim";
        }
        return "nao";
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo='" + codigo + '\'' +
                ", sala='" + sala + '\'' +
                ", horario=" + horario +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void imprimirAlunos(){
        this.getAlunos()
                .forEach(aluno -> System.out.println(aluno.getNome()));
    }
}
