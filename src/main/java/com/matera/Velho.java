package com.matera;

public class Velho extends Imovel {


    public Velho(String endereco, int preco) {
        super(endereco, preco * 1);
    }

    public String toString() {
        return preco + " : " + endereco;
    }

//    @Override
//    public int compareTo(Object temp) {
//       Novo objeto = (Novo) temp;
//        if (getPreco() > objeto.getPreco()) {
//            return 1;
//        } else if (getPreco() < objeto.preco) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
