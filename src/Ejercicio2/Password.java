
package Ejercicio2;
//Francisco José Contreras Sanabria - CS2016 - PGRII
public class Password { //Crear una clase Password que contenga atributos de longitud, contraseña, constructores y métodos
    //Atributos
    private int longitud;
    String contrasena;
    private final int LONG_DEF=8;
    
    //Insertamos los Constructores
    public Password() {
        this.longitud = LONG_DEF;
        this.contrasena = contrasena;
    }
    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }
    //Insertamos los Métodos
    public String getcontrasena(){
        return contrasena;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    private String generarPassword(){
        contrasena = "";
        return contrasena;
    }
}
