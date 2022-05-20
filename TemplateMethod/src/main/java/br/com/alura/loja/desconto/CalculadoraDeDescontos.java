package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDesontos =
                new DescontoParaOrcamentoComMaisDeCincoItens(
                    new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()
                    )
                );

        return cadeiaDeDesontos.calcular(orcamento);
    }
}
