public class FluxoComErro {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex){    
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
        System.out.println("ini do metodo 2");
        metodo2();
        System.out.println("fim do metodo 2");
    }
}
//Um dos erros mais conhecidos é exatamente o "StackOverflowError.", fazendo referencia à página que salva nós devs :)

// No nosso console foi possivel indetificar um erro, erro este que pertence a uma classe que herda da "Throwable", porém esta classe está restrita a o nossa maquina virtual e não interagimos diretamente com ela.

// Nosso metodo entrou em um loop, o qual podemos ver através do console que nossa Stack ou pilha tem um limite de execução, limite este, para impedir que nossa memoria seja totalmente ocupada.