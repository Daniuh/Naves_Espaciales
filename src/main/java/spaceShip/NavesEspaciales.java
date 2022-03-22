package spaceShip;

public abstract class NavesEspaciales implements PropiedadesComunesEnNaves{
    protected double empuje;
    protected String combustible;
    protected double peso;
    protected double empujeNave2;
    protected String combustibleNave2;
    protected double pesoNave2;

    public NavesEspaciales(double empuje, String combustible, double peso, double empujeNave2, String combustibleNave2, double pesoNave2){
        this.empuje = empuje;
        this.combustible = combustible;
        this.peso = peso;
        this.empujeNave2 = empujeNave2;
        this.combustibleNave2 = combustibleNave2;
        this.pesoNave2 = pesoNave2;
    }


    public abstract void SegundoNombre();
    public abstract void ArranqueNave2(); //Comportamientos abstracto
    public abstract void DestinoNave2(); //Comportamientos abstracto
}
