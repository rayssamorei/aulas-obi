//🔥 Exercício 5 – Verificar se é palíndromo Descrição: Crie um método que verifique se uma palavra ou frase é um palíndromo (igual ao contrário), ignorando espaços e letras maiúsculas. Exemplo: Entrada: "Socorram me subi no onibus em Marrocos" Saída: É um palíndromo

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = sc.nextLine();

        String limpa = entrada.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String invertida = new StringBuilder(limpa).reverse().toString();

        if (limpa.equals(invertida)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
