//✅ Exercício 2 – Converter string para maiúsculas/minúsculas Descrição: Leia uma frase do usuário e mostre: A mesma frase toda em letras maiúsculas A mesma frase toda em letras minúsculas

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "";
        String fraseMaiuscula = "";
        String fraseMinuscula = "";
        

        System.out.println("Escreva uma palavra:");
        frase = sc.nextLine();

        fraseMaiuscula = frase.toUpperCase();
        fraseMinuscula = frase.toLowerCase();

        System.out.println("Maiuscula: "+fraseMaiuscula);
        System.out.println("Minuscula: "+fraseMinuscula);
    }
}
