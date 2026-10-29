package br.com.loja.frete;

public class FreteExpresso implements FreteStrategy {
    @Override
    public double calcular(double pesoKg) {
        validarPeso(pesoKg);
        return 25.0 + pesoKg * 3.0;
    }

    private void validarPeso(double pesoKg) {
        if (!Double.isFinite(pesoKg) || pesoKg <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
    }
}
