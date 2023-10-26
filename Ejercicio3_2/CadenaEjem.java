package Ejercicio3_2;

public class CadenaEjem {
    String cadenaInicial = "Programacion orientada a objetos";

    public static void main(String[] args) {
        CadenaEjem cadena = new CadenaEjem();
        int longitud = cadena.cadenaInicial.length();
        System.out.println("La longitud del String es = "+ longitud);
        String CadenaSinEspacios = cadena.cadenaInicial.trim();
        System.out.println("El String sin espacios en blanco = "+ CadenaSinEspacios);
        String cadenaMayusculas = CadenaSinEspacios.toUpperCase();
        System.out.println("El string en mayusculas = "+ cadenaMayusculas);
        String cadenaConcatenada = cadenaMayusculas.concat("12345");
        System.out.println("El string Concatenado = "+ cadenaConcatenada);
        String CadenaExtraida = cadenaConcatenada.substring(24,31);
        System.out.println("El string extraido = "+ CadenaExtraida);
        String cadenaRemplazada = CadenaExtraida.replace("O","X");
        System.out.println("El string remplazado = "+ CadenaExtraida);
        boolean comparacion = cadenaRemplazada.equals("Programacion");
        System.out.println("Los strings son iguales ="+ comparacion);


        System.out.println("\n <<<<<<<<<<<<<EJERCICIOS PROPUESTOS>>>>>>>>>>>");
        String cadenita = " Yo soy Adrian Muñoz España";
        System.out.println("\n El texto a contar MAY. es <<<Yo soy Adrian Muñoz España>>>");
        System.out.println("Numero de mayusculas en el texto consignado ed de  :  ");
        EjercicioPropuesto POR = new EjercicioPropuesto();
        POR.ContadorDeMayusculas("Yo soy Adrian Muñoz España");
    }
}

