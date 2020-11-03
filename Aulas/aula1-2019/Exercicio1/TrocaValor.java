/*Escreva um programa em Java que contenha as variáveis a e b, com valore 3 e 5 , respectivamente, para exemplo. O programa deve trocar o valor das variáveis , o valor de a vai para b e o de b vai para a , sm atribuir diretamente os números. No final, exiba os valores das variáveis.
*/
public class TrocaValor{
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("O valor de a é " + a);
        System.out.println("O valor de b é " + b);
    }
}