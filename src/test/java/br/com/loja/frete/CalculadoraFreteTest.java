package br.com.loja.frete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraFreteTest {
    @Test
    void calculaFreteEconomico() {
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteEconomico());

        assertEquals(14.5, calculadora.calcularFrete(3.0), 0.001);
    }

    @Test
    void calculaFreteExpresso() {
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteExpresso());

        assertEquals(34.0, calculadora.calcularFrete(3.0), 0.001);
    }

    @Test
    void retiradaNaLojaNaoCobraFrete() {
        CalculadoraFrete calculadora = new CalculadoraFrete(new RetiradaNaLoja());

        assertEquals(0.0, calculadora.calcularFrete(3.0), 0.001);
    }

    @Test
    void permiteTrocarEstrategia() {
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteEconomico());

        calculadora.definirEstrategia(new FreteExpresso());

        assertEquals(34.0, calculadora.calcularFrete(3.0), 0.001);
    }

    @Test
    void rejeitaPesoInvalido() {
        CalculadoraFrete calculadora = new CalculadoraFrete(new FreteEconomico());

        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularFrete(0));
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularFrete(-2));
    }
}
