public class PercentualMensal {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;
        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        System.out.println("Percentual de investimentos em São Paulo: " + percentualSP + "%");
        System.out.println("Percentual de investimentos no Rio de Janeiro: " + percentualRJ + "%");
        System.out.println("Percentual de investimentos em Minas Gerais: " + percentualMG + "%");
        System.out.println("Percentual de investimentos no Espírito Santo: " + percentualES + "%");
        System.out.println("Percentual de investimentos em outros estados: " + percentualOutros + "%");
    }
}
