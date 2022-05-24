**Design Pattern Observer**

O padrão Observer é comumente utilizado por diversas bibliotecas que trabalham com eventos. Muitas tecnologias em Java, como o Spring e o CDI, possuem componentes que nos auxiliam a trabalhar com eventos.

A forma como o padrão foi implementado aqui na aula é a mais simples e pura, mas existem diversas modificações que podem ser feitas.

Para entender mais sobre a teoria deste padrão, você pode conferir este link: https://refactoring.guru/design-patterns/observer.

**Nesta aula, aprendemos:**

Que deixar a implementação de todas as tarefas de um caso de uso da aplicação na mesma classe pode trazer problemas:
Dificuldade de manutenção;
Classes muito grandes e difíceis de ler;
Problemas quando precisar alterar a implementação de uma das tarefas.
Que é mais interessante separar cada ação em uma classe separada;
Como ligar um evento ocorrido com suas ações, através do padrão Observer.