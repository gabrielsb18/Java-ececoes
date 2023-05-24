public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex){    
            String msg = ex.getMessage();
            System.out.println("Exception" + msg);
            ex.printStackTrace(); 
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
       
        throw new MinhaExcecao(" deu muito errado!"); // Mensagem no parametro do construtor da exceção!

        //System.out.println("Fim do metodo2");
    }
    
}

//Não é necessário guardar a exceção em uma variável, podendo lançá-la diretamente em uma linha só, como no caso acima!

//A referência exception aponta para a ArithmeticException, que está no HEAP (memória de objetos). (alura)

// Através do codigo "throw" de forma exemplar, dizemos para nosso código pegar o objeto criado e jogar na nossa pilha de execução!

//throw = "jogar".

//Nessa nova versão do código criamos um novo obejeto da classe ArithmeticException no metodo 2, e transformamos este objeto em uma exceção, exceção que irá jogar uma "bomba" na pilha, exibindo o erro no nosso console.