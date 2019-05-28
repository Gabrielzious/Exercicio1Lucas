package com.matera;

public class Novo extends Imovel {

    public Novo(String endereco, int preco) {
        super(endereco, preco * 2);

    }

//    @Override
//    public int compareTo( Novo temp) {
//        //Novo objeto = (Novo) temp;
//
//        return new Integer(this.preco).compareTo(temp.getPreco());

//        if (this.preco > temp.preco) {
//            return 1;
//        } else if (this.preco < temp.preco) {
//            return -1;
//        } else {
//            return 0;
//        }

    }