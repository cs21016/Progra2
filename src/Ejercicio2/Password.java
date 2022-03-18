
package Ejercicio2;
//Francisco José Contreras Sanabria - CS2016 - PGRII
public class Password { //Crear una clase Password que contenga atributos de longitud, contraseña, constructores y métodos
    //Atributos
    private int longitud;
    String contrasena;
    private final int LONG_DEF = 8;
    private final static int SECURE_PASSWD_NUM = 5;
    private final static int SECURE_PASSWD_MAYUS = 2;
    private final static int SECURE_PASSWD_MINUS = 1;
    
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
        for (int i=0;i<longitud;i++){
            switch ((int)(Math.random()*3)){
                case 0:
                    char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                    contrasena+=minusculas;
                case 1:
                   char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                   contrasena+=mayusculas;
                case 2:
                   char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                   contrasena+=numeros;
            }
        }
        return contrasena;
    }
    //Comprobamos si la contraseña es fuerte o no con un valor booleano
    public boolean esFuerte(){
        int contNum=0, contMinus=0, contMayus=0;
        for (int i = 0; i < this.longitud; i++){
            if (contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122){
                contMinus+=1;
            }
            else {
                if (contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90){
                    contMayus+=1;
            }
            else {
               contNum+=1; 
            }
        }
    }
        return contMayus > SECURE_PASSWD_MAYUS && contMinus > SECURE_PASSWD_MINUS && contNum > SECURE_PASSWD_NUM ? true : false;
    }
}
