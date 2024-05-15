package br.desafio.objects;

import br.desafio.dominio.BootCamp;
import br.desafio.dominio.Curso;
import br.desafio.dominio.Dev;
import br.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Objects {

    public void retornaObjetos(){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("React");
        curso2.setDescricao("Curso de React");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setMome("Bootcamp Java developer");
        bootCamp.setDescricao("Descricao java developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Reinaldo");
        dev1.inscreverBootCamp(bootCamp);

        System.out.println("Conteudos inscritos dev1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXpTotal());


        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootCamp(bootCamp);

        System.out.println("Conteudos inscritos dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXpTotal());



    }
}
