**Chain of responsibility**

_Resumo:_

* O padrão conhecido como Chain Of Responsibility, corrente de responsabilidades onde eu tenho uma corrente, uma sequência, um fluxo de responsabilidades e eu vou verificando qual delas precisa ser aplicada. Se uma não for aplicada, ele está ligado e tem um elo com a próxima e ele vai chamar a próxima. Se for aplicada, aplicou e encerrou o assunto.
* Se não for, chama o próximo, chama o próximo até chegar no fim dessa corrente. Essa que é a ideia do padrão Chain Of Responsibility. Então eu preciso verificar qual regra precisa ser aplicada. E aí cada classe implementamos essa cadeia para conhecer a próxima utilizando o construtor. Então toda classe de desconto precisa receber como parâmetro no construtor quem será o próximo caso ela não seja aplicada.

_Ex:_

* Se o atendente de N1 talvez não tenha conhecimentos técnicos muito aprofundados, ele vai pedir para você reiniciar o seu modem, para você fazer um teste mais simples e se ele não conseguiu resolver passa para um atendente de N2 que vai fazer um teste mais apurado e mais técnico. Se ele não conseguiu atender vai passar para um técnico de N3 até chegar um atendente que vai precisar ir até sua casa, enfim. Então percebe, eu tenho um problema, eu vou passando nível por nível.
* Se um conseguiu atender, resolveu o problema. Se não conseguiu, vai para o próximo. Eu vou escalando esse problema até chegar na solução final. Então seria uma analogia do padrão Chain Of Responsibility no mundo real. Essa que é a ideia desse padrão. Então ele é utilizado quando você tem essa situação. Eu tenho várias regras, mas eu não sei qual delas precisa ser aplicada de cara.
* Eu preciso verificar se ela vai ser aplicada. Se ela não for aplicada, eu preciso conhecer e chamar a próxima. Então é diferente do Strategy. Então o código a princípio parecia que íamos utilizar o Strategy, mas aí veio essa diferença que eu não sei qual é a estratégia, qual é o algoritmo a ser aplicado. Eu preciso verificar e se não for o caso, chamar o próximo.