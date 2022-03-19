package Ejercicio2;
//Francisco José Contreras Sanabria - CS2016 - PGRII

public class Password { //Crear una clase Password que contenga atributos de longitud, contraseña, constructores y métodos
    //Atributos

    private int longitud;
    public String contrasena;
    private final static int LONG_DEF = 8;
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
    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    private String generarPassword() {
        contrasena = "";
        for (int i = 0; i < longitud; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0:
                    contrasena += (char) (Math.random() * 26 + 'a');
                    break;
                case 1:
                    contrasena += (char) (Math.random() * 26 + 'A');
                    break;
                case 2:
                    contrasena += (char) (Math.random() * 10 + '0');
                    break;
            }
        }
        return contrasena;
    }
    //Comprobamos si la contraseña es fuerte o no con un valor booleano
    public boolean esFuerte() {
        int contNum = 0, contMinus = 0, contMayus = 0;
        for (int i = 0; i < this.longitud; i++) {
            if(this.contrasena.charAt(i) >= 'A' && this.contrasena.charAt(i) <= 'Z')
                contMayus++;
            if (this.contrasena.charAt(i) >= 'a' && this.contrasena.charAt(i) <= 'z') {
                contMinus++;
            }
            if (this.contrasena.charAt(i) >= '0' && this.contrasena.charAt(i) <= '9') {
                contNum++;
            }
        }
        if (contMayus > SECURE_PASSWD_MAYUS && contMinus > SECURE_PASSWD_MINUS && contNum > SECURE_PASSWD_NUM) {
            return true;
        } else {
            return false;
        }
    }
}
