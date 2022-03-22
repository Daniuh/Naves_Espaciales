package spaceShip;

public class NavesEspecialesTripuladas extends NavesEspaciales{
    public double orbitacion;
    public double orbitacionNave2;
    public int capacidadPersonas;
    public int capacidadPersonasNave2;

    public NavesEspecialesTripuladas(double empuje, String combustible, double peso, double empujeNave2, String combustibleNave2, double pesoNave2) {
        super(empuje, combustible, peso, empujeNave2, combustibleNave2, pesoNave2);
        this.peso = 77; //Toneladas
        this.pesoNave2 = 19.8; //Toneladas
        this.orbitacion = 435; //Km
        this.orbitacionNave2 = 248.9; //Km
        this.capacidadPersonas = 3;
        this.capacidadPersonasNave2 = 3;

    }

    @Override
    public void Nombre() {
        System.out.println("El nombre de está nave espacial tripulada es: Vital 2.0");
        System.out.println("Posee un peso de: "+peso+" toneladas");

    }

    @Override
    public void Destino() {
        System.out.println("La nave tripulada Vital 2.0 va a orbitar la superficie terrestre");
        System.out.printf("Y su orbitación es de: "+orbitacion+" Km");
    }

    @Override
    public void Arranque() {
        System.out.printf("Su arranque se vera ligado a un vehículo lanzadaera");
        System.out.printf("Y la nave podrá transportar una capacidad de: "+capacidadPersonas+" tripulantes");
    }

    @Override
    public void SegundoNombre() {
        System.out.println("El nombre de está nave espacial tripulada es: Vital 2.1");
        System.out.println("Posee un peso de: "+pesoNave2+" toneladas");
    }

    @Override
    public void ArranqueNave2() {
        System.out.printf("Su arranque se vera ligado a un vehículo lanzadaera");
        System.out.printf("Y la nave podrá transportar una capacidad de: "+capacidadPersonasNave2+" tripulantes");
    }

    @Override
    public void DestinoNave2() {
        System.out.println("La nave tripulada Vital 2.0 va a orbitar la superficie lunar ");
        System.out.printf("Y su orbitación es de: "+orbitacionNave2+" Km");
    }
}
