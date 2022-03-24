package spaceShip;

public abstract class Spaceships implements Behaviors {
    protected double pushWeight; //Empuje
    protected String fuel; //Combustible
    protected double weight; //Peso
    protected double pushWeightShip2; //Empuje nave 2
    protected String fuelShip2; //Combustible nave 2
    protected double weightShip2; //Peso nave 2

    public Spaceships(double pushWeight, String fuel, double weight, double pushWeightShip2, String fuelShip2, double weightShip2){
        this.pushWeight = pushWeight;
        this.fuel = fuel;
        this.weight = weight;
        this.pushWeightShip2 = pushWeightShip2;
        this.fuelShip2 = fuelShip2;
        this.weightShip2 = weightShip2;
    }

    public abstract void Name(); //Nombre
    public abstract void TwoName(); //Segundo nombre
    public abstract void OutburstShip2(); //Comportamientos abstracto //Arranque nave 2
    public abstract void DestinyShip2(); //Comportamientos abstracto // Destino nave 2
}
