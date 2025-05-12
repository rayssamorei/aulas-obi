import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeOscar = sc.nextInt();
        int idadeOtavio = sc.nextInt();

        int idadeOrlando = (idadeOtavio - idadeOscar) + idadeOtavio;

        System.out.println(idadeOrlando);

        sc.close();
    }
}