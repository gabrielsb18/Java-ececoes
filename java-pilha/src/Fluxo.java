public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }  catch (ArithmeticException ex){    // Excessão que quero tratar!
            //String msg = ex.getMessage();
            //System.out.println("ArithmeticException" + msg); 
        }
           
        System.out.println("Fim do main");
    }
    
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i/0;
        }

        System.out.println("Fim do metodo2");
    }
}

// A partir do momento que capturamos o catch, tratando nossa excessão, a maquina virtual continua seu fluxo de execução! 

// Pra tratar excessões existe um código especifico, é o "try". Equanto para passar o erro que pode ocorrer utilizamos o código "catch".

// O próximo passo e descobrir como podemos tratar as excessões, ou seja criar um código para resolver a "bomba", que cai na nossa "Stack", assim que é encontrado um erro, para que ela não possa "prejudicar" o nosso código por completo, no caso, ser resolvido apenas no primeiro metodo o qual ocorre o erro.

//Mas como podemos sinalizar para quem chamar o método saca(), que o saque não está funcionando por um motivo específico? (alura). É aqui que entra as excessões! No nosso caso o método retorna somente "Funcionou" ou "Não funcionou", mas queremos que ele nos retorne motivos específicos quando não funcionar.

// O nosso código deduz apenas um caso para a excessão ou erro ocorrer, que é o saldo insuficiente, pórem em qualquer cenário real podem existir diversos motivos para isso, pode ser o horário comercial, limite diario, banco fechado, entre outros.

//As exceções são problemas que acontecem na hora de compilar o código. Considerando que existe uma variedade imensa, elas possuem nomes explicativos e, às vezes, mostram claramente o motivo de seu surgimento, facilitando a identificação delas. (alura)

//Excessões fazem parte do controle do fluxo!

//Situação de excessões = entender como o ocorre o erro adicionando o porque do erro ter ocorrido.

//O compilador não indica todos os erros possiveis!

//"Debugar" = olhar por "dentro" do sistemas ou inspecinar, isso de foma lenta! Essa função é utíl quando ocorre algum erro ou prblema e que não sabemos onde esta ocorrendo!

//Após o "ponto de depuração", executamos um debug ou (Debugar). 

// Ao clicarmos duas vezes seguida ao lado da linha do código é mostrado um "ponto de depuração"(azul), onde sinalizamos onde queremos que o código pare de executar.(Eclipse)

// Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados. Além do bloco de código a pilha guarda as variáveis e as referências desse bloco. Assim a JVM organiza a execução e sabe exatamente qual método está sendo executado que é sempre o método no topo da pilha. A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo. (Alura)

// O JVM usa um "Stack" para saber oque está sendo executado e para organizar a execução dos métodos.

// Assim que termina o main o processo encerra.

// A pilha funciona em formato "cascata", primeiro executa todos os  metodos, e logo em seguida executa "de trás para frente" o restante do código.

// A "pilha" se inicia no metodo main. Ela existe pra executar algo e lembrar ainda oque precisa ser organizado.

//"Pilha" ou "Stack" = organiza a execução do nosso código, para lembrar oque ainda precisa ser organizado.