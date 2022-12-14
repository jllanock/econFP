import java.util.Scanner;
/**
 * Write a description of class Curso_SUC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso_SUC
{
    public static void main(String[] args){

        Scanner seb = new Scanner (System.in);
        System.out.println("ingrese el numero de estudiantes de su curso");
        int CE = seb.nextInt();
        System.out.println("ingrese el nombre de su curso");

        seb.nextLine(); //esta línea hace que el Scanner no ignore el siguiente input

        String NC = seb.nextLine();
        double ND = 0;
        double PC = 0;
        int c = 0;
        while (c<CE)
        {
            System.out.println("ingrese la nota del estudiante #" + (c+1));
            ND = seb.nextDouble();
            PC = PC+ND;
            c++;
        }
        PC=PC/CE;
    
        System.out.println("el promedio final de: " +PC);
    }
    
    
    
}