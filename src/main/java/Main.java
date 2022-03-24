import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);
        Integer personDecision;
        Scanner name = new Scanner(System.in);
        System.out.println("¡Hola para poder empezar ingrese su nombre! \n");
        String namePerson = name.nextLine();
        do {
            Menu menu = new Menu();
            menu.MenuOption(namePerson);
            System.out.println("\nOpciones para continuar \n1: Salir\n2: Continuar");
            personDecision = init.nextInt();
        }while(personDecision == 2);
        init.close();
    }
}
