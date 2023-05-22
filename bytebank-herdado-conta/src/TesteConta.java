public class TesteConta { 
    public static void main (String [] args) {

        //int a = 3 ;
       // int b = a/0;

        //ContaCorrente outra = null;
        //outra.deposita(200.0);
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
    
}

//Obs: posso crir um metodo main toda vez que eu tiver que testar uma funcionalidade da nossa classe.

//Construtor da classe mãe : "super()"