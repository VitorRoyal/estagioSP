public class VetorFaturamento {
    public static void main(String[] args) {
        double[] faturamentoMensal = {22174.1664, 24537.6698, 26139.6134, 0, 0 ,26742.6612,0,42889.2258,46251.174,11191.4722,0,0,3847.4823,373.7838,2659.7563,48924.2448,18419.2614,0,0,35240.1826,43829.1667,18235.6852,4355.0662,13327.1025,0,0,25681.8318,1718.1221,13220.495,8414.61};

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (double faturamento : faturamentoMensal) {
            if (faturamento != 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (double faturamento : faturamentoMensal) {
            if (faturamento != 0 && faturamento > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Média de faturamento: " + mediaFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

    }
}
