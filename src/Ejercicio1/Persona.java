package Ejercicio1;
//Francisco José Contreras Sanabria - CS21016 - PGRII

public class Persona {//Crear una clase persona con sus atributos: nombre, edad, DUI, sexo (H hombre, M mujer), peso y altura.
    //Atributos
    private String nombre;
    private int edad;
    private int DUI;
    private char sexo;
    private double peso;
    private double altura;
    //Constantes
    private final static char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    //Insertamos constructores
    public Persona() {
        nombre = "";
        edad = 0;
        sexo = SEXO_DEF;
        peso = 0;
        altura = 0;
    }
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = 0;
    }
    public Persona(String nombre, int edad, int DUI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDUI();
        this.sexo = sexo;
        comprobSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    //Estableciendo los Métodos -> (Privado)
    private char comprobSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm') {
            return 'M';
        } else {
            return 'H';
        }
        /*if(sexo!='H' && sexo!='M'){
            this.sexo='H';
        }else{
            this.sexo=sexo;
        }*/
    }
    private void generarDUI() {
        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
    }

    //Estableciendo los Métodos -> (Públicos)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setAltura(double altura){
        this.altura =altura;
    }
}
