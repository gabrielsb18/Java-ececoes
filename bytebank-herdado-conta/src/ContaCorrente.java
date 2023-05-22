public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}


// O "@Override" informa para o compilador que meu methodo atual é uma reescrita do meu codigo da classe mãe, sendo assim, ele indica erros caso eu digite algo indevido ou de forma errada que seja diferente da classe base(mãe).

//Posso reescrever um methodo de forma automatica na minha classe através do nome do atributo junto com as teclas crtl+space.

// Construtores não são herdados na herança! Apena metodos e atributos!

// Não é possivel herdar por padrão um construtor esepecifico de uma classe. Pórem ... caso eu queira chamr um construtor especifico eu adiciono entre parenteses meus atributos.