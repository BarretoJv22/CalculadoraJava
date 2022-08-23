/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

/**
 *
 * @author leame
 */
import javax.swing.JOptionPane;

public class TesteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int operando1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));

        int resultado = calculadora.somar(operando1, operando2);
        JOptionPane.showMessageDialog(null, " ta aqui a resposta: " + resultado);
    }

}
