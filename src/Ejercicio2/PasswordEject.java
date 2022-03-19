package Ejercicio2;

import javax.swing.JOptionPane;
import Ejercicio2.Password;

public class PasswordEject {

    public static void main(String[] args) {
        //Introducimos el tamaño del array y la longitud del password
        String texto=JOptionPane.showInputDialog("Introducir tamaño del array");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introducir longitud del password");
        int longitud=Integer.parseInt(texto);
  
        //Creamos los arrays
        Password listaContrasena[]=new Password[tamanio];
        boolean fortalezaContrasena[]=new boolean[tamanio];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaContrasena.length;i++){
            listaContrasena[i]=new Password(longitud);
            fortalezaContrasena[i]=listaContrasena[i].esFuerte();
            System.out.println(listaContrasena[i].getContrasena()+" "+fortalezaContrasena[i]);
        }
    }
}
