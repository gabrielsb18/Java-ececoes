public interface Tributavel {

    public abstract double getValorImposto();

}






//Herança possibilita sim polimorfismo E reutilização de codigo.(Alura)

//Com interfaces temos uma alternativa ao polimorfismo, com a composição temos uma alternativa a reutilização de código. (Alura)

//Com composições e interfaces teremos mais flexibilidade com nosso código, já que não nos prenderemos ao acoplamento que a herança propõe. (Alura)

// INTERFACES NÃO POSSUI ATRIBUTOS! POSSUI METODOS

//Não há necessidade de utilizarmos o abstract antes de interface, já que este último já presume que tudo que há nele é de fato abstrato. (Alura)
//Obs: Não é necessário eu fazer a utilização do "public abstract" pois toda a minha interface já é, no caso o proprio compilador não aponta nehum erro.