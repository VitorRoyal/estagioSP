public class InversorCaracteres {
    public static void main(String[] args) {
        String texto = "Contrate o Vitor para trabalhar na Target";
        String textoInvertido = inverterCaracteres(texto);
        System.out.println(textoInvertido);
    }

    private static String inverterCaracteres(String texto) {
        char[] caracteres = texto.toCharArray();
        int i = 0;
        int j = caracteres.length - 1;

        while (i < j) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
            i++;
            j--;
        }

        return new String(caracteres);
    }
}
