public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
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
        }
        System.out.println("Fim do metodo2");
        
    }
}

//"Debugar" = olhar por "dentro" do sistemas ou inspecinar, isso de foma lenta! Essa função é utíl quando ocorre algum erro ou prblema e que não sabemos onde esta ocorrendo!

//Após o "ponto de depuração", executamos um debug ou (Debugar). 

// Ao clicarmos duas vezes seguida ao lado da linha do código é mostrado um "ponto de depuração"(azul), onde sinalizamos onde queremos que o código pare de executar.(Eclipse)

// Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados. Além do bloco de código a pilha guarda as variáveis e as referências desse bloco. Assim a JVM organiza a execução e sabe exatamente qual método está sendo executado que é sempre o método no topo da pilha. A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo. (Alura)

// O JVM usa um "Stack" para saber oque está sendo executado e para organizar a execução dos métodos.

// Assim que termina o main o processo encerra.

// A pilha funciona em formato "cascata", primeiro executa todos os  metodos, e logo em seguida executa "de trás para frente" o restante do código.

// A "pilha" se inicia no metodo main. Ela existe pra executar algo e lembrar ainda oque precisa ser organizado.

//"Pilha" ou "Stack" = organiza a execução do nosso código, para lembrar oque ainda precisa ser organizado.