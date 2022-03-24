package spaceShip;

public class ShuttleVehicle extends Spaceships {
    protected String power; //potencia
    protected String powerShip2; //Potencia nave 2
    protected double capacityToTransport; //Capacidad para transportar
    protected double capacityToTransportShip2; //Capacidad para transportar nave 2
    protected double height; //Altura
    protected double heightShip2; //Altura nave 2
    protected double abilityToTravel; //Capacidad para recorrer
    protected double abilityToTravelShip2; //Capacidad para recorrer nave 2

    public ShuttleVehicle(double pushWeight, String fuel, double weight, double pushWeightShip2, String fuelShip2, double weightShip2) {
        super(pushWeight, fuel, weight, pushWeightShip2, fuelShip2, weightShip2);
        this.height = 110.6; //Metros
        this.heightShip2 = 60; //Metros
        this.abilityToTravel = 0; //Km
        this.abilityToTravelShip2 = 0; //Km
        this.power = "3.200x5"; //Caballos
        this.powerShip2 = "2.800x4"; //Caballos
        this.capacityToTransport = 118; //Toneladas
        this.capacityToTransportShip2 = 100; //Toneladas
    }

    public void Name() {
        System.out.println("Falcon 1 \n"
                            + "El combustible que utiliza esté vehículo lanzador es: "+ fuel +"\n"
                            + "La capacidad para recorrer es: "+ abilityToTravel +" Km, Por falta de especificaciones \n"
                            + "Y la altura que tiene es de: "+ height +" metros \n" + "\n");
    }

    @Override
    public void Outburst() {
        System.out.println("El vehículo lanzador de nombre: Falcon 1. Está listo para ser utilizado \n"
                            + "El peso de el lanzador es de: "+ weight +" toneladas \n"
                            + "Y posee un empuje de: "+ pushWeight +" toneladas \n" + "\n");
    }

    @Override
    public void Destiny() {
        System.out.println("El destino del Falcon 1 es a la luna \n"
                            + "La capacidad que tiene para transportar es de: "+ capacityToTransport +" toneladas \n"
                            + "Y posee una potencia de: "+ power +" caballos \n" + "\n");
    }

    @Override
    public void TwoName() {
        System.out.println("Falcon 2 \n"
                            + "El combustible que utiliza está nave es: "+ fuelShip2 + "\n"
                            + "La capacidad para recorrer es: "+ abilityToTravelShip2 +". Por falta de especificaciones \n"
                            + "Y la altura que tiene es de: "+ heightShip2 +" metros \n" + "\n");
    }

    @Override
    public void OutburstShip2() {
        System.out.println("El vehículo lanzador de nombre: Falcon 2. Está listo para ser utilizado \n"
                            + "El peso de el lanzador es de: "+ weightShip2 +" toneladas \n"
                            + "Y posee un empuje de: "+ pushWeightShip2 +" toneladas \n" + "\n");
    }

    @Override
    public void DestinyShip2() {
        System.out.println("El destino del Falcon 2 es a la luna \n"
                            + "La capacidad que tiene para transportar es de: "+ capacityToTransportShip2 +" toneladas \n"
                            + "Y posee una potencia de: "+ powerShip2 +" caballos");
    }

}
