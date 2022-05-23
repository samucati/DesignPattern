package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteOrcamento {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 3);
        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();
        System.out.println(orcamento.getValor());
    }
}
