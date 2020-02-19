package Soma;
import javax.swing.*;
public class RestoDivisao {
     public static void main(String args[]){
        String aux="";
        double num1 = 0, num2 = 0, resto = 0;
    aux = JOptionPane.showInputDialog(null, "Entre com o valor a ser dividido: ");
    num1 = Double.parseDouble(aux);
    
    aux = JOptionPane.showInputDialog(null, "Entre com o numero divisor: ");
    num2 = Double.parseDouble(aux);
    
    resto = (num1%num2);
    JOptionPane.showMessageDialog(null,"O resto da divisão é: "+resto);
    }
}