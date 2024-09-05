import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= numero) {
            if (c == numero) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;

        //Este metodo statico primeiro irá verificar se o numero é 0 ou 1, se for, ele retornará true, pois 0 e 1 são os dois primeiros números da sequência de Fibonacci.
        //Caso contrário, ele inicializa três variáveis a, b e c com 0, 1 e 1, respectivamente.
        //Em seguida, ele entra em um loop while que continua até que c seja maior que o número fornecido.
        //Dentro do loop, ele verifica se c é igual ao número fornecido e, se for, retorna true.
        //Se c não for igual ao número fornecido, ele atualiza os valores de a, b e c para os próximos números na sequência de Fibonacci.
        //Se o loop terminar sem encontrar o número fornecido, ele retornará false!!

    }
}