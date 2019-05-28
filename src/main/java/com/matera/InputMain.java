package com.matera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputMain{
    public static void main(String[] args){


        List<Novo>  novos = new ArrayList<Novo>();

        Novo n1 = new Novo("Rua Nova X", 102000);
        Novo n2 = new Novo("Rua Nova J", 425000);
        Novo n3 = new Novo("Rua Nova R", 788000);
        Novo n4 = new Novo("Rua Nova P", 1390000);
        Novo n5 = new Novo("Rua Nova T", 290000);

        novos.add(n1);
        novos.add(n2);
        novos.add(n3);
        novos.add(n4);
        novos.add(n5);

        Collections.sort (novos);

        System.out.println("Listagem das casas novas: \n");
        for(Novo novo : novos) {
            System.out.println(novo);
        }

        System.out.println("\n");


        List<Velho> velhos = new ArrayList<Velho>();

        Velho v1 = new Velho("Rua velha L",1200000);
        Velho v2 = new Velho("Rua velha Q",680000);
        Velho v3 = new Velho("Rua velha A",322900);
        Velho v4 = new Velho("Rua velha U",220000);
        Velho v5 = new Velho("Rua velha W",488900);

        velhos.add(v1);
        velhos.add(v2);
        velhos.add(v3);
        velhos.add(v4);
        velhos.add(v5);

        Collections.sort (velhos);

        System.out.println("Listagem das casas velhas: \n");
        for(Velho velho : velhos)
            System.out.println(velho);


    }

}









        /*
        if (resultado < 0) {
            System.out.println(n1.getPreco() + "vem antes de " + n2.getPreco());
        }
        else if(resultado > 0) {
            System.out.println(n2.getPreco() + "vem dps de " + n1.getPreco());
        }
        else {
            System.out.println(n1.getPreco() + "é igual a " + n2.getPreco());
        }

         */