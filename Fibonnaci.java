//sequência de fibonnaci em java com recursividade

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("A sequência de Fibonnaci para o número "+n+" é: "+fibonacci(n));
    }
    public static int fibonacci (int num){
        if(num == 0){
            return 0;
        } else if (num == 1){
            return 1;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
