import classes.Curso;
import classes.Mentoria;
import classes.Dev;
import classes.Bootcamp;

import java.time.LocalDate;

public class Main{

    static boolean isDEBUG = true;

    public static void main(String[] args){

        cleanConsoleScreen();

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria js");
        mentoria.setDescricao("descricao mentoria js");
        mentoria.setData(LocalDate.now());
 
        if(isDEBUG){
            System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);
        }


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

 
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
