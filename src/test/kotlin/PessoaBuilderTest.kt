import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Pessoa private constructor(builder: Builder) {
    var cor: String? = null
    var idade: Int? = null
    var casado: Boolean? = null

    class Builder {
        private var cor: String? = null
        private var idade: Int? = null
        private var casado: Boolean? = null

        fun comCor(cor: String) = apply { this.cor = cor }
        fun comIdade(idade: Int) = apply { this.idade = idade }
        fun casado(casado: Boolean) = apply { this.casado = casado }
        fun build() = Pessoa(this)

        fun getCor() = cor
        fun getIdade() = idade
        fun getCasado() = casado
    }

    init {
        cor = builder.getCor()
        idade = builder.getIdade()
        casado = builder.getCasado()
    }
}

class PessoaBuilderTest {
    @Test
    fun `deve criar uma pessoa`() {
        val pessoa = Pessoa.Builder()
            .comCor("azul")
            .comIdade(10)
            .casado(true)
            .build()

        assertEquals("azul", pessoa.cor)
        assertEquals(10, pessoa.idade)
        assertEquals(true, pessoa.casado)
    }
}