package proyectojj;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
//Definición de personajes

        Scanner sc = new Scanner(System.in);
        Meta villain = new Meta();
        villain.setName("Doctor Nefasto");
        villain.setDef(3);
        villain.setStr(20);

//Presentación de la escena

        System.out.println(villain.name+" está haciendo de las suyas.");
        sc.nextLine();
        Hero superhero = new Hero();
        System.out.println("¡Pero aquí viene "+superhero.name+" para salvar el día!");
        sc.nextLine();
        System.out.println("Fuerza: "+superhero.str);
        System.out.println("Defensa: "+superhero.def);
        System.out.println("Puntos de vida: "+superhero.hp);
        System.out.println("Experiencia: "+superhero.exp);
        System.out.println("Nivel: "+superhero.lv);
        System.out.println("Puntos para siguiente nivel: "+superhero.nextlv);
        System.out.println("Posibilidad de crítico: "+superhero.crit);
        System.out.println("Índice de evasión: "+superhero.ev);
        sc.nextLine();

//Turno del héroe

        while (villain.hp>0 && superhero.hp>0){
            if(superhero.str>villain.def)
                {
                    System.out.println("¡Bam! "+superhero.name+" le arrea un soplamocos a "+villain.name+" de "+(superhero.str - villain.def)*3 +" puntos de daño");
                    villain.hp -= ((superhero.str - villain.def)*3);
                }
                else
                {
                    System.out.println(superhero.name + " pega como una niña y no hace ná");

                }

//Turno del villano

            sc.nextLine();

            if(villain.str>superhero.def)
            {
                System.out.println("¡Bam! "+villain.name+" le arrea un soplamocos a "+superhero.name+" de "+(villain.str - superhero.def)*1 +" puntos de daño");
                superhero.hp -= ((villain.str - superhero.def)*3);
            }
            else
            {
                System.out.println(villain.name + " pega como una niña y no hace ná");
            }
            sc.nextLine();
            System.out.println(superhero.name + " : " + superhero.hp);
        }

//Resolución

        if (villain.hp <= 0){
            System.out.println(villain.name+ " se tambalea y cae al suelo, lamentando el día en que se enfrentó a "+ superhero.name);
            System.out.println("¡"+superhero.name+" vuelve a triunfar!");
        }

        if (superhero.hp <=0) {
            System.out.println("Game over, el mundo está en el caos, eres un manta");
        }
    }



}
