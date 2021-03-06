import br.com.jf.desafio.dominio.*;

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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos dev1:" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos dev1:" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos dev1:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("------");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }

}
