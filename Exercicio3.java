import java.util.Scanner;
//✅ Exercício 3 – Imprimir cada caractere separado Descrição: Leia uma palavra e imprima cada letra em uma linha separada. Exemplo: Entrada: "Java" Saída: J a v a
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = "";
        

        System.out.println("Escreva uma palavra:");
        palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);

            System.out.println(c);
        }

    }
}
