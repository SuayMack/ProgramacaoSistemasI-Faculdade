// Escreva um pro grama em JAva que exiba todos os numeros primos de 2 a 500.
// Um número primo é um número divisível apenas por 1 e por ele mesmo.

public class Primos{
    public static void main(String[] args) {
        for(int i = 2; i < 500; i++){
            boolean primo = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }                
               
            } 
            if(primo){
                System.out.print(i + " ");
            }
        }
    }
}