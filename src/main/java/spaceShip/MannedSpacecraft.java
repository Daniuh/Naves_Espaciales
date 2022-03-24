package spaceShip;

public class MannedSpacecraft extends Spaceships {
    protected double orbitation; //Orbitación
    protected double orbitationShip2; //Orbitación nave 2
    protected int capacityPerson; //Capacidad persona
    protected int capacityPersonShip2; //Capacidad persona nave 2

    public MannedSpacecraft(double pushWeight, String fuel, double weight, double pushWeightShip2, String fuelShip2, double weightShip2) {
        super(pushWeight, fuel, weight, pushWeightShip2, fuelShip2, weightShip2);
        this.orbitation = 435; //Km
        this.orbitationShip2 = 248.9; //Km
        this.capacityPerson = 3;
        this.capacityPersonShip2 = 3;
    }

    public void Name() {
        System.out.println("El nombre de está nave espacial tripulada es: Vital 2.0");
        System.out.println("Posee un peso de: "+ weight +" toneladas");

    }

    @Override
    public void Destiny() {
        System.out.println("La nave tripulada Vital 2.0 va a orbitar la superficie terrestre");
        System.out.printf("Y su orbitación es de: "+ orbitation +" Km");
    }

    @Override
    public void Outburst() {
        System.out.printf("Su arranque se vera ligado a un vehículo lanzadaera");
        System.out.printf("Y la nave podrá transportar una capacidad de: "+ capacityPerson +" tripulantes");
    }

    @Override
    public void TwoName() {
        System.out.println("El nombre de está nave espacial tripulada es: Vital 2.1");
        System.out.println("Posee un peso de: "+weightShip2+" toneladas");
    }

    @Override
    public void OutburstShip2() {
        System.out.printf("Su arranque se vera ligado a un vehículo lanzadaera");
        System.out.printf("Y la nave podrá transportar una capacidad de: "+ capacityPersonShip2 +" tripulantes");
    }

    @Override
    public void DestinyShip2() {
        System.out.println("La nave tripulada Vital 2.0 va a orbitar la superficie lunar ");
        System.out.printf("Y su orbitación es de: "+ orbitationShip2 +" Km");
    }
}
