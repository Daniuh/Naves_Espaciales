package spaceShip;

public class VehículoLanzadera extends NavesEspaciales {
    public String potencia;
    public String potenciaNave2;
    public double capacidadParaTransportar;
    public double capacidadParaTransportarNave2;
    public double altura;
    public double alturaNave2;
    public double capacidadParaRecorrer;
    public double capacidadParaRecorrerNave2;

    public VehículoLanzadera(double empuje, String combustible, double peso, double empujeNave2, String combustibleNave2, double pesoNave2) {
        super(empuje, combustible, peso, empujeNave2, combustibleNave2, pesoNave2);
        this.altura = 110.6; //Metros
        this.alturaNave2 = 60; //Metros
        this.capacidadParaRecorrer = 0; //Km
        this.capacidadParaRecorrerNave2 = 0; //Km
        this.potencia = "3.200x5"; //Caballos
        this.potenciaNave2 = "2.800x4"; //Caballos
        this.capacidadParaTransportar = 118; //Toneladas
        this.capacidadParaTransportarNave2 = 100; //Toneladas
        this.empuje = 3500; //Toneladas
        this.empujeNave2 = 3060; //Toneladas
        this.combustible = "Químico Sólido o Propelente Líquido";
        this.combustibleNave2 = "Químico Sólido o Propelente Líquido";
        this.peso = 2900; //Toneladas
        this.pesoNave2 = 2400; //Toneladas

    }

    @Override
    public void Nombre() {
        System.out.println("Falcon 1");
        System.out.println("El combustible que utiliza esté vehículo lanzador es: "+combustible);
        System.out.println("La capacidad para recorrer es: "+capacidadParaRecorrer+". Por falta de especificaciones");
        System.out.println("Y la altura que tiene es de: "+altura+" metros");
    }

    @Override
    public void Arranque() {
        System.out.println("El vehículo lanzador de nombre: Falcon 1. Está listo para ser utilizado");
        System.out.println("El peso de el lanzador es de: "+peso+" toneladas");
        System.out.println("Y posee un empuje de: "+empuje+" toneladas");
    }

    @Override
    public void Destino() {
        System.out.println("El destino del Falcon 1 es a la luna");
        System.out.println("La capacidad que tiene para transportar es de: "+capacidadParaTransportar+" toneladas");
        System.out.println("Y posee una potencia de: "+potencia+" caballos");
    }

    @Override
    public void SegundoNombre() {
        System.out.println("Falcon 2");
        System.out.println("El combustible que utiliza está nave es: "+combustibleNave2);
        System.out.println("La capacidad para recorrer es: "+capacidadParaRecorrerNave2+". Por falta de especificaciones");
        System.out.println("Y la altura que tiene es de: "+alturaNave2+" metros");
    }

    @Override
    public void ArranqueNave2() {
        System.out.println("El vehículo lanzador de nombre: Falcon 2. Está listo para ser utilizado");
        System.out.println("El peso de el lanzador es de: "+pesoNave2+" toneladas");
        System.out.println("Y posee un empuje de: "+empujeNave2+" toneladas");
    }

    @Override
    public void DestinoNave2() {
        System.out.println("El destino del Falcon 2 es a la luna");
        System.out.println("La capacidad que tiene para transportar es de: "+capacidadParaTransportarNave2+" toneladas");
        System.out.println("Y posee una potencia de: "+potenciaNave2+" caballos");
    }

}
