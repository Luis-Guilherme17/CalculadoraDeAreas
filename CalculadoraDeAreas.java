/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadoraDeAreas {
//Eu sou Luís Guilherme e estou fazendo a minha primeira calculadora
    public static void main(String[] args) {
   //Definição de dois números
   double N1 = 5.5;
   double N2 = 10.5;
   
   //Operações Matemáticas
   double soma = N1 + N2;
   double subtracao = N1 - N2;
   double multiplicacao = N1 * N2;
   double divisao = N2 != 0 ? N1/ N2 : Double.NaN;
   double resto = N1 % N2;
   
   //Exibindo resultados
   System.out.println("Resultado das operações:");
   System.out.println("Soma: " + soma);
   System.out.println("Subtração: "+ subtracao);
   System.out.println("Multiplicação: " + multiplicacao);
   System.out.println("Divisão: " + (N2 != 0 ? divisao : "Indefinida (divisão por zero)"));
   System.out.println("Resto da divisão: " + resto);
    }
    
}
