import java.util.Scanner;
//fatorial em Java usando for, sem recursividade
public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int[] fatorial = new int[num];
        //se num = 4, índices: 0,1,2,3

        fatorial[0]=1;
        for(int i = 1; i < num; i++){
            fatorial[i] = fatorial[i - 1] * (i + 1);
            //se num = 4, fatorial[1] = fatorial[0] * (1 + 1) -> 1 + 2 = 2
            //fatorial[2]= fatorial[1] * (2+1) -> 2 * 3 = 6
            //fatorial[3]= fatorial[2] * (3+1) -> 6 * 4 = 24
        }

        System.out.println("O fatorial do número " + num + " é: "+fatorial[num-1]);

        sc.close();
    }

}