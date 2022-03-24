package spaceShip;

public class UnmannedShip extends Spaceships {
    protected double displacement; //Desplazamiento
    protected int engines; //Motores

    public UnmannedShip(double pushWeight, String fuel, double weight, double pushWeightShip2, String fuelShip2, double weightShip2) {
        super(pushWeight, fuel, weight, pushWeightShip2, fuelShip2, weightShip2);
        this.displacement = 12000; //Km/h
        this.engines = 4 ;
    }

    @Override
    public void Name() {
        System.out.printf("El nombre de la nave no tripulada es: GenesisXp \n");
        System.out.printf("Y tendrá un desplazamiento de: "+ displacement +" Km/h \n" + "\n");
    }

    @Override
    public void Destiny() {
        System.out.printf("Como destino, su deber será orbitar geoestacionariamente, o no, nuestro planeta \n"
                            + "Tiene un empuje de: "+ pushWeight +" toneladas \n"
                            + "Y posee la cantidad de: "+ engines +" motores de combustión de monometilhidracina (MMH) y óxido nítrico \n" + "\n");
    }

    @Override
    public void Outburst() {
        System.out.printf("Como arranque tendrá que ser apoyada de la compañia de un vehículo lanzador");
    }

    @Override
    public void TwoName() {
        System.out.printf("No hay segunda nave en está clase");
    }

    @Override
    public void OutburstShip2() {
        System.out.printf("No hay segunda nave en está clase");
    }

    @Override
    public void DestinyShip2() {
        System.out.printf("No hay segunda nave en está clase");
    }
}
