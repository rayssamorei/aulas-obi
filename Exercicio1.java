
//Exercício 1 – Contar caracteres de uma string Descrição: Peça ao usuário que digite uma palavra e mostre quantos caracteres ela possui (sem contar espaços). Exemplo de entrada: "Olá mundo" Saída esperada: 8 caracteres
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String descricao = "";
        int letras = 0;
        

        System.out.println("Escreva uma palavra:");
        descricao = sc.nextLine();

        for (int i = 0; i < descricao.length(); i++) {
            char c = descricao.charAt(i);

            if (c != ' ') {
                letras++;
            }
        }

        System.out.println("Na palavra tem " + letras +" letras");
    }
}