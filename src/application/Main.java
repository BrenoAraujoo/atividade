package application;

import java.time.LocalDateTime;
import model.Aluno;
import model.Professor;
import model.Turma;

public class Main {

    public static void main(String[] args) {
        //Data atual
        LocalDateTime dataTurma = LocalDateTime.of(2022,12,22,18,00);
        //Professor
        Professor professor = new Professor("Professor 1", "Mestre em CC");
        //Turmas
        Turma turma = new Turma("1234","Sala 000",dataTurma, professor);

        //Alunos
        Aluno breno = new Aluno("Breno Araujo",1001);
        Aluno jhon = new Aluno("Jhon Cavalcante",1002);
        Aluno alexandre = new Aluno("Alexandre Santos",1003);

        //Adiciona Alunos na turma
        turma.getAlunos().add(breno);
        turma.getAlunos().add(jhon);
        turma.getAlunos().add(alexandre);

        System.out.println("------------");


        System.out.println("Turma está aberta?");

        LocalDateTime dataAtual = LocalDateTime.of(2022, 12, 22, 16, 00);

        System.out.println(turma.estaAberta(dataAtual));


        System.out.println("horario da turma: " + dataTurma );
        System.out.println("horario atual: " + dataAtual );


        System.out.println("Lista de alunos");

        turma.imprimirAlunos();
    }
}
