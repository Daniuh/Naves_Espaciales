package spaceShip;

public class NaveNoTripulada extends NavesEspaciales{
    public double desplazamiento;
    public int motores;

    public NaveNoTripulada(double empuje, String combustible, double peso, double empujeNave2, String combustibleNave2, double pesoNave2) {
        super(empuje, combustible, peso, empujeNave2, combustibleNave2, pesoNave2);
        this.empuje = 0.2; //Toneladas
        this.desplazamiento = 12.000; //Km/h
        this.motores = 4 ;
    }

    @Override
    public void Nombre() {
        System.out.printf("El nombre de la nave no tripulada es: GenesisXp");
        System.out.printf("Y tendrá un desplazamiento de: "+desplazamiento+" Km/h");
    }

    @Override
    public void Destino() {
        System.out.printf("Como destino, su deber será orbitar geoestacionariamente, o no, nuestro planeta");
        System.out.printf("Tiene un empuje de: "+empuje+" toneladas");
        System.out.printf("Y posee la cantidad de: "+motores+" motores de combustión de monometilhidracina (MMH) y óxido nítrico");

    }

    @Override
    public void Arranque() {
        System.out.printf("Como arranque tendrá que ser apoyada de la compañia de un vehículo lanzador");
    }

    @Override
    public void SegundoNombre() {
        System.out.printf("No hay segunda nave en está clase");
    }

    @Override
    public void ArranqueNave2() {
        System.out.printf("No hay segunda nave en está clase");
    }

    @Override
    public void DestinoNave2() {
        System.out.printf("No hay segunda nave en está clase");
    }
}
