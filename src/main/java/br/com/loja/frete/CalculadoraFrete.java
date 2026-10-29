package br.com.loja.frete;

import java.util.Objects;

public class CalculadoraFrete {
    private FreteStrategy estrategia;

    public CalculadoraFrete(FreteStrategy estrategia) {
        this.estrategia = Objects.requireNonNull(estrategia, "A estratégia é obrigatória.");
    }

    public void definirEstrategia(FreteStrategy estrategia) {
        this.estrategia = Objects.requireNonNull(estrategia, "A estratégia é obrigatória.");
    }

    public double calcularFrete(double pesoKg) {
        return estrategia.calcular(pesoKg);
    }
}
