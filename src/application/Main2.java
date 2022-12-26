package application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Professor;
import model.Turma;

public class Main2 {

    public static void main(String[] args) {

        Professor jose = new Professor("Jose","Mestrado");

        Aluno breno = new Aluno("Breno",0010);
        Aluno jhon = new Aluno("jhon",0012);


        Turma turma22 = new Turma("Codigo 22","Salaa 22",LocalDateTime.now(),jose);

        turma22.getAlunos().add(breno);
        turma22.getAlunos().add(jhon);


        System.out.println(turma22.getAlunos());

        System.out.println("------------");

        List<Aluno> novaLista  = new ArrayList<>();
        turma22.setAlunos(novaLista);

        System.out.println(turma22.getAlunos());


    }
}
