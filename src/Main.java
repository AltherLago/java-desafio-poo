import classes.Curso;
import classes.Mentoria;

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
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
