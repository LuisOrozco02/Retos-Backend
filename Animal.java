public class Animal {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private String habitat;

public Animal(String nombre, String especie, int edad, double peso, String habitat) {
    this.nombre = nombre;
    this.especie = especie;
    this.edad = edad;
    this.peso =  peso;
    this.habitat = habitat;

}   
public void hacerSonido() {
    System.out.println(" está haciendo un sonido.");
}

public void comer(){
    System.out.println(nombre + " esta comiendo.");
}

public boolean esMayorQue(int edadComparada) {
    return edad > edadComparada;
}
}
