public class Investimento {
    private String tipo;
    private double valorInvestido;

    public Investimento(String tipo, double valorInvestido) {
        this.tipo = tipo;
        this.valorInvestido = valorInvestido;
    }

    public double simularRetorno(int meses) {
        double taxa = switch (tipo.toLowerCase()) {
            case "cdb" -> 0.01;
            case "acoes" -> 0.03;
            default -> 0.005;
        };
        return valorInvestido * Math.pow(1 + taxa, meses);
    }
}
