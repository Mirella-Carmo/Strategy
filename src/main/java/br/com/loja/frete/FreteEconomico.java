package br.com.loja.frete;

public class FreteEconomico implements FreteStrategy {
    @Override
    public double calcular(double pesoKg) {
        validarPeso(pesoKg);
        return 10.0 + pesoKg * 1.5;
    }

    private void validarPeso(double pesoKg) {
        if (!Double.isFinite(pesoKg) || pesoKg <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
    }
}
