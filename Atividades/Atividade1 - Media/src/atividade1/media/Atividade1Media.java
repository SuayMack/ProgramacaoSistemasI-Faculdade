/* Atividade 1 - Programação de Sistemas I
    @author Priscila Chueryz dos Santos 
    R. A.: 1821518-5
*/

package atividade1.media;

import javax.swing.JOptionPane;
public class Atividade1Media {

    public static void main(String[] args) {
        // Inicio Código com instrução do mediador
        //Declaração de variáveis
        float n1, n2, n3, media, resultadoExame;
        //variáveis para armazenamento
        String nota1, nota2, nota3;
        
        //Solicitar notas e guardar nas variáveis (em string)
        nota1 = JOptionPane.showInputDialog("Informe a primeira nota (0.00): ");
        nota2 = JOptionPane.showInputDialog("Informe a segunda nota (0.00): ");
        nota3 = JOptionPane.showInputDialog("Informe a terceira nota (0.00): ");
        
        // Converter as notas em números
        n1 = Float.parseFloat(nota1);
        n2 = Float.parseFloat(nota2);
        n3 = Float.parseFloat(nota3);
        
        // Cálculo da média
        media = (n1 + n2 + n3)/3;
        
        // Mostre se ficou para exame, considerando a média 7
        if(media >= 7){//Passou
            JOptionPane.showConfirmDialog(null, "Parabéns, você passou!\n Sua Média é: " + media);
        }else{// caso tenha ficado para exame
            // Seguindo instrução do mediador**
           resultadoExame = (10 - media);
           JOptionPane.showConfirmDialog(null, "Você não passou!\nSua nota no exame deverá ser acima de: " + resultadoExame);
        }// Fim Código com instrução do mediador
        
        // ATENÇÃO: Como o execício estava muito complicado de entender e pra falar a verdade não entendi
        //nem a explicação do mediador direito, fiz mais um código conforme meu entendimento:
        /*Inicio do código que eu entendi:
        
        
        //Declaração de variáveis
        float n1, n2, n3, media, resultadoExame;
        //variáveis para armazenamento
        String nota1, nota2, nota3;
        
        //Solicitar notas e guardar nas variáveis (em string)
        nota1 = JOptionPane.showInputDialog("Informe a primeira nota (0.00): ");
        nota2 = JOptionPane.showInputDialog("Informe a segunda nota (0.00): ");
        nota3 = JOptionPane.showInputDialog("Informe a terceira nota (0.00): ");
        
        //Converter as notas em números
        n1 = Float.parseFloat(nota1);
        n2 = Float.parseFloat(nota2);
        n3 = Float.parseFloat(nota3);
        
        media = (n1 + n2 + n3)/3;
        resultadoExame = 10 - media;
        
        if(media >= 7){
            JOptionPane.showConfirmDialog(null, "Parabéns, você passou!\n Sua Média é: " + media);
        }else{
            if(resultadoExame >= 5){
                JOptionPane.showConfirmDialog(null, "Você não passou!\nSua média foi de: " + media + "\nVocê deverá tirar: " + resultadoExame +" no exame.");
            }else {
                JOptionPane.showConfirmDialog(null, "Você não passou!\nSua média foi de: " + media + "\nVocê deverá tirar: 5.00 no exame.");
            }
                
        }*/    
        
    }   
}