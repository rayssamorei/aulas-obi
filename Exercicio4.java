import java.util.Scanner;
//⚠️ Exercício 4 – Substituir vogais por asteriscos Descrição: Peça uma frase e substitua todas as vogais (a, e, i, o, u) por . Exemplo: Entrada: "Aprendendo Java" Saída: "prndnd* Jv"
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = "";
        String novaFrase = "";
        

        System.out.println("Escreva uma palavra:");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ) {
                novaFrase += '*';
            } else {
                novaFrase += c;
            }
        }

        System.out.println(novaFrase);

    }
}
