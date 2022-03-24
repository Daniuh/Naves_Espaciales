import spaceShip.*;

import java.util.Scanner;

/***
 * Esta clase llamará los métodos creados para poder cumplir con el menu que se le imprime al usuario
 * @author Daniel Mauricio Naranjo Benavides
 */
public class Menu {
    Scanner decision = new Scanner(System.in);
    Spaceships naves;

    /***
     * Método que recopila toda la lógica y procede a ejecutar
     * @param namePerson Este parametro es para poder añadir en algunos mensajes el nombre de la persona
     */
    public void MenuOption(String namePerson){
        System.out.println("\nHola "+namePerson+" a continuación le daremos el menu de opciones para que decidas.\n");
        System.out.printf("|****** <MENU DE OPCIONES> ******| \n \n"
                + "1: Vehículo Lanzadera \n2: Naves espaciales no tripuladas \n3: Naves espaciales no tripuladas para misiones \n4: Naves especiales tripuladas \n \n"
                + "|****** <> FIN MENU DE OPCIONES <> ******| \n");

        System.out.println("\n"+namePerson+" elija por favor una opción \n");
        Integer decisionPerson = decision.nextInt();

        switch (decisionPerson) {
            case 1 -> {
                option1(namePerson);
            }
            case 2 -> {
                option2();
            }
            case 3 -> {
                option();
            }
            case 4 -> {
                option4(namePerson);
            }
            default -> {System.out.println("Opción no valida");}
        }
    }

    Scanner option = new Scanner(System.in);

    public void option(){
        System.out.printf("Has tomado la opción de comprar una Nave No Tripulada Para Misiones. \n A continuación te daremos las diferentes misiones: \n"
                + "1: Saturno y sus lunas \n2: Júpiter \n3: Marte \n4: Mercurio \n5: Plutón \n6: Urano Y Neptuno \n7: Sol \n8: Venus \n \n"
                +"Elige una opción por favor \n");

        Integer optionPerson = option.nextInt();
        UnmannedSpacecraftForMissions naves = new UnmannedSpacecraftForMissions();
        switch (optionPerson) {
            case 1 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Saturno y sus lunas. \nAqui sus propiedades \n");
                naves.SaturnAndItsMoons();
            }
            case 2 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Júpiter. \nAqui sus propiedades: \n");
                naves.Jupiter();
            }
            case 3 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Marte. \nAqui sus propiedades: \n");
                naves.Mars();
            }
            case 4 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Mercurio \nAqui sus propiedades: \n");
                naves.Mercury();
            }
            case 5 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Plutón. \nAqui sus propiedades: \n");
                naves.Pluto();
            }
            case 6 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Urano Y Neptuno. \nAqui sus propiedades: \n");
                naves.UranusAndNeptune();
            }
            case 7 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Sol \nAqui sus propiedades: \n");
                naves.Sun();
            }
            case 8 -> {
                System.out.printf("Has elegido comprar una Nave No Tripulada para la misión de Venus \nAqui sus propiedades: \n");
                naves.Venus();
                System.out.println("Opción no valida");
            }
            default -> System.out.println("Opción no valida");
        }
    }

    public void option1(String namePerson){
        System.out.printf("Has elegido comprar un Vehículo Lanzadera. \n"
                + "Ahora elige una de las dos opciones. \n"
                + "\n¡¡Recuerda que estas dos opciones tienen diferente propiedades!!\n"
                + "\n"
                + "1: Falcon 1 \n"
                + "2: Falcon 2 \n"
                + "\n"
                + "Elija Sr/Sra " + namePerson + " Por favor \n");
        Integer decisionPerson2 = decision.nextInt();
        naves = new ShuttleVehicle(3500, "Químico Sólido o Propelente Líquido", 2900, 3060, "Químico Sólido o Propelente Líquido", 2400);
        if (decisionPerson2 == 1) {
            naves.Name();
            naves.Outburst();
            naves.Destiny();
        } else if (decisionPerson2 == 2) {
            naves.TwoName();
            naves.OutburstShip2();
            naves.DestinyShip2();
        } else {
            System.out.println("Opción no valida");
        }
    }

    public void option2(){
        System.out.printf("Has elegido comprar una Nave Espacial No Tripulada \n"
                + "Estas son us especificaciones: \n" + "\n");
        naves = new UnmannedShip(0.2, "", 0, 0, "", 0);
        naves.Name();
        naves.Destiny();
        naves.Outburst();
    }

    public void option4(String namePerson){
        System.out.printf("Has elegido comprar una Nave Espacial Tripulado. \n"
                + "Ahora elige una de las dos opciones."
                + "\n"
                + "\n ¡¡Recuerda que estas dos opciones tienen diferente propiedades\n"
                + "\n"
                + "1: Vital 2.0 \n"
                + "2: Vital 2.1 \n \n"
                + "Elija Sr/Sra " + namePerson + " Por favor\n");
        Integer decisionPerson3 = decision.nextInt();
        naves = new MannedSpacecraft(0, "", 77, 0, "", 19.8);
        if (decisionPerson3 == 1) {
            naves.Name();
            naves.Destiny();
            naves.Outburst();
        } else if (decisionPerson3 == 2) {
            naves.TwoName();
            naves.DestinyShip2();
            naves.OutburstShip2();
        } else {
            System.out.println("Opción no valida");
        }
    }
}
