O Java possui uma biblioteca específica para a criação de aplicações para Desktop, 
nela há diversas classes para representarmos botões, ou campos de texto, por exemplo.

No Eclipse, com o atalho "Ctrl + Shift + T" podemos buscar qualquer classe.
A JTextField, ela serve para a criação de um campo de texto por exemplo.

O conceito de herança é bastante utilizado em aplicações Android!

// (alura anotação)

"Outro exemplo comum é para a conexão com banco de dados, onde temos de enviar comandos para referido banco. Esta ideia independe de qual banco utilizamos, pode ser MySQL, Oracle, ou outros. Para isso, há uma ideia genérica, que é a Connection, por meio da qual enviamos estes comandos.

Internamente, apesar de os diferentes bancos funcionarem de formas diferentes, para a Connection isso não importa.

Abriremos a interface Connection, com o seguinte codigo:

public interface Connection extends Wrapper, AutoCloseable {"

//

"Neste curso, criamos a base de conceitos importantíssimos no mundo Java, começando com herança, passando pela reescrita, redefinição de métodos, a utilização do super, para subirmos na hierarquia.

Vimos também que a herança não existe para construtores, mas que é possível chamarmos um construtor da classe mãe. Vimos o modificador de visibilidade protected, aberto para as classes filhas mas fechado para as demais.

Falamos ainda sobre classes e métodos abstratos, indo para o polimorfismo, onde temos um objeto que nunca muda de tipo, mas que pode ser enxergado a partir de vários pontos de referência.

Vimos ainda as interfaces, para termos uma alternativa ao polimorfismo, e a composição, que é uma alternativa à reutilização de código.

Criamos uma base para vários outros tópicos do mundo Java. Espero que tenham entendido os conceitos, não esqueçam de praticar, até a próxima!"