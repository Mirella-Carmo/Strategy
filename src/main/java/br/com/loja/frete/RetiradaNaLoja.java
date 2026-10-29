package br.com.loja.frete;

public class RetiradaNaLoja implements FreteStrategy {
    @Override
    public double calcular(double pesoKg) {
        if (!Double.isFinite(pesoKg) || pesoKg <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        return 0.0;
    }
}
