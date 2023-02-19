public class Questao3 {
    public static void main(String[] args){
        System.out.print("Custo antes do cálculo: R$ 300,00\nImposto: 12%\nCusto após impostos: ");
        System.out.printf("R$ %.2f", somaImposto(12, 300));
    }
    public static double somaImposto(double taxaImposto, double custo){
        return custo * (1 + taxaImposto/100);
    }
}
