package Ejercicio3_2;

public class EjercicioPropuesto {
    public void ContadorDeMayusculas(String cadena){
        int contador = 0;
        for (int i =0; i <cadena.length(); i++){
            char caracter = cadena.charAt(i);
            if (Character.isUpperCase(caracter)){
                contador++;
            }
        }
        System.out.println(contador);
    }

}
