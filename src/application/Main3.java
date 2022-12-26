package application;

import java.time.LocalDateTime;
import model.Aluno;
import model.Professor;
import model.Turma;

public class Main3 {

    public static void main(String[] args) {

        Professor jose = new Professor("Jose","Mestrado");

        Turma turma = new Turma("123","sala 000", LocalDateTime.now(),jose);


    }
}
