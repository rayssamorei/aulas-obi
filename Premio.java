import java.util.Scanner;

public class Premio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;
        int dias = 0;

        for(int i = 0; i < n; i++){
            int acessosDia = sc.nextInt();
            soma += acessosDia;
            dias++;
            if(soma >= 1000000){
                break;
            }
        }

        System.out.println(dias);

        sc.close();
    }
}
