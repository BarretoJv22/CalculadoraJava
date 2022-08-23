/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

/**
 *
 * @author leame
 */
public class Calculadora {

    int resultado;

    public int somar(int numero1, int numero2) {

        resultado = numero1 + numero2;
        return resultado;
    }

    public void exibirResultado() {
        System.out.println("o resultado é: " + resultado);
    }
}
