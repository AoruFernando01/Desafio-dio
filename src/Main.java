import br.com.jf.desafio.dominio.Curso;
import br.com.jf.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria java");
       mentoria.setDescricao("descrição mentoria java");
       mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
