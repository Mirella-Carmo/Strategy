# Sobre a atividade

Uma loja virtual oferece opções diferentes para a entrega dos pedidos. O cálculo do frete muda conforme a modalidade escolhida, então cada regra fica em uma classe própria e a calculadora usa a opção selecionada.

# Regras de validação

- O peso do pedido deve ser um número finito e maior que zero.
- O frete econômico custa R$ 10,00 mais R$ 1,50 por quilo.
- O frete expresso custa R$ 25,00 mais R$ 3,00 por quilo.
- A retirada na loja não cobra frete.
- A estratégia pode ser trocada sem alterar a classe `CalculadoraFrete`.