package spaceShip;

public class UnmannedSpacecraftForMissions {
    protected double displacement; //Desplazamiento
    protected int engines; //Motores
    protected double pushWeight; //Empuje
    protected String fuel; //Combustible
    protected double weight; //Peso
    protected double velocity; //Velocidad
    protected double launchMass; //Masa de lanzamiento
    protected double electricalPower; // Potencia eléctrica

    public void SaturnAndItsMoons(){
        fuel = "MMH y tetróxido de nitrógeno";
        pushWeight = 45.39; //Kg
        displacement = 18000; //Km/h

        System.out.println("La nave espacial no tripulada de nombre: Cassini-Huygens \n"
                            + "Tiene un desplazamiento de: "+displacement+" Km/h \n"
                            + "Cuenta con un empuje de: "+pushWeight+" Kg \n"
                            + "Y su combustible es: "+fuel+"\n"
                            + "Se estima que su llegada a su destino tarda 7 años");
    }

    public void Jupiter(){
        weight = 258; //Kg
        pushWeight = 26; //Kg

        System.out.println("La nave espacial no tripulada de nombre: Pioneer X \n"
                            + "Pesa: "+weight+" Kg \n"
                            + "Y tiene un empuje de: "+pushWeight+" Kg \n"
                            + "Se estima que su llegada a su destino tarda 1 año y 9 meses");
    }

    public void Mars(){
        fuel = "Nitrógeno comprimido";
        pushWeight = 134.9; //Kg

        System.out.println("La nave espacial no tripulada de nombre: Vikingo I \n"
                            + "Es propulsado por : "+fuel+" \n"
                            + "Y tiene un empuje de: "+pushWeight+" Kg \n"
                            + "Se estima que su llegada a su destino tarda 333 días");
    }

    public void Mercury(){
        weight = 1093; //Kg
        pushWeight = 65.79; //Kg

        System.out.println("La nave espacial no tripulada de nombre: Mariner XX \n"
                + "Posee un peso de: "+weight+" Kg \n"
                + "Y tiene un empuje de: "+pushWeight+" Kg \n"
                + "Se estima que su llegada a su destino tarda 147 días");
    }

    public void Pluto(){
        engines = 16; //Motores
        pushWeight = 0.44; //Kg
        velocity = 56000; //Km/h

        System.out.println("La nave espacial no tripulada de nombre: New Horizons II \n"
                + "Posee: "+engines+" Motores \n"
                + "Tiene un empuje de: "+pushWeight+" Kg \n"
                + "Y posee una velocidad de: "+velocity+" Km/h \n"
                + "Se estima que su llegada a su destino tarda 9 años");
    }

    public void UranusAndNeptune(){
        launchMass = 825.5; //Kg
        electricalPower = 420; //vatios

        System.out.println("La nave espacial no tripulada de nombre: Voyager I \n"
                + "Posee una masa de lanzamiento de: "+launchMass+" Kg \n"
                + "Y tiene una potencia eléctrica de: "+electricalPower+" Vatios \n"
                + "Se estima que su llegada a su destino tarda de 9 a 12 años");
    }

    public void Sun(){
        velocity = 70.4; //Km/s
        launchMass = 685; //Kg
        electricalPower = 343; //vatios
        System.out.println("La nave espacial no tripulada de nombre: Helios \n"
                            + "Posee una velocidad de: "+velocity+" Km/s \n"
                            + "Tiene una masa de lanzamiento de: "+launchMass+" Kg \n"
                            + "Y tiene una potencia eléctrica de: "+electricalPower+" Vatios \n"
                            + "Se estima que su llegada a su destino tarda 3 años");
    }

    public void Venus(){
        launchMass = 201; //Kg

        System.out.println("La nave espacial no tripulada de nombre: Voyager I \n"
                + "Posee una masa de lanzamiento de: "+launchMass+" Kg \n"
                + "Se estima que su llegada a su destino tarda 1 año");
    }
}
