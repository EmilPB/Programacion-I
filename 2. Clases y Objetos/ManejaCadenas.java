public class ManejaCadenas {

    public static void main(String[] args) {}

    public String Reverso(String Palabra) { // Done
        StringBuffer Reverso = new StringBuffer(Palabra); 
        return Reverso.reverse().toString();
    }

    public String EliminaVocales(String Oracion) { // Done
        String Eliminado = Oracion.replaceAll("[AaEeIiOoUu]", "");
        return Eliminado;
    }

    public String CuentaVocales(String Palabra) { // Done
        int vocales = 0;
        for(int i = 0; i < Palabra.length(); ++i)
        {
            char ch = Palabra.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vocales += 1;
            }
        }
        return "La cantidad de vocales es: " + vocales;
    }

    public String CuentaConsonantes(String Palabra) { // Done
        int count = 0;
        for (int i=0 ; i < Palabra.length(); i++){
            char ch = Palabra.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.print("");
            }else if(ch != ' '){
                count++;
            }
        }
        return "La cantidad de consonantes es: " + count;
    }

    public String CuentaPalabras(String Oracion) { // Done
        String[] Palabras = Oracion.split("\\s+");
        int i = Palabras.length;
        return "La cantidad de palabras es: " + i;
    }
}