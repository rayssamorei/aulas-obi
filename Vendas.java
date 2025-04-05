import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdVendas = 0;
        System.out.println("Quantas vendas você deseja registrar?"); //Recebendo a qtd de vendas
        qtdVendas = sc.nextInt();
        sc.nextLine();

        String[] dados = new String[qtdVendas]; //criando um vetor pra armazenar as informações de cada venda por linha, separando os campos por vírgula

        for (int i = 0; i < qtdVendas; i++) { //percorrendo o vetor e inserindo os dados
            dados[i] = sc.nextLine();
        }

        String departamento = "";
        System.out.print("Departamento: "); //recebendo o departamento
        departamento = sc.nextLine();

        mostrarTotalDepartamento(dados, departamento); //mostrando os resultados dos dois vetores: qtd e total das vendas do departamento especifico
        sc.close();
    }
    // Função recursiva auxiliar
    public static void auxiliarTotalSales(String[] dados, String departamento, int index, double[] total, double[] qtdRegistros) {
        if (index >= dados.length) return; //condição de parada pra a função

        String[] partes = dados[index].split(","); //separando os dados pelas vírgulas

        if (partes.length == 4) { //verificando se existe 4 informações (ou 4 vírgulas)
            double valor = Double.parseDouble(partes[2].trim()); //transformando a parte[2](onde tem o preço) de String em Double, pra conseguir somar os valores
            String depto = partes[3].trim(); //pegando a parte 3, o departamento e armazenando em uma variável

            if (depto.equalsIgnoreCase(departamento)) { //verificando se o departamento é o mesmo q foi especificado, pra assim somar as vendas apenas daquele departamento
                total[0] += valor; //somando as vendas
                qtdRegistros[0]++; //incrementando as vendas
            }
        } else {
            System.out.println("Formato inválido na linha: " + dados[index]); //mensagem de erro
        }

        auxiliarTotalSales(dados, departamento, index + 1, total, qtdRegistros); //recursividade, aumentando o index
    }

    public static double[][] totalSales(String[] dados, String departamento) {
        double[] total = new double[1];
        double[] qtdRegistros = new double[1];

        auxiliarTotalSales(dados, departamento, 0, total, qtdRegistros); //chamando a função recursiva

        return new double[][]{total, qtdRegistros}; //retornando os dois vetores
    }

    public static void mostrarTotalDepartamento(String[] dados, String departamento) { //função pra mostrar os resultados na tela
        double[][] resultados = Vendas.totalSales(dados, departamento);
    
        double totalFinal = resultados[0][0];
        double qtdTotal = resultados[1][0];
        
        System.out.printf("%.0f VENDAS\n", qtdTotal);
        System.out.printf("TOTAL %s = R$ %.2f\n", departamento, totalFinal);
    }
}