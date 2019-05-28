package com.matera;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NovaTest
{

    @Test
    public void testValorAumentadoDoImovelNovo() {
        Imovel novo = new Novo("rua whatever", 2_000);

        Assert.assertEquals(2_000, novo.getPreco());
    }

    @Test
    public void testEnderecoResidencial() {
        Imovel novo2 = new Novo("Rua Santana", 356000);

        Assert.assertEquals("Rua Santana", novo2.getEndereco());
    }

    @Test
    public void testOrdemValoresResidenciasVelhas() {
        Novo novo1 = new Novo("Rua Santana", 356_000);
        Novo novo2 = new Novo("rua whatever", 21_000);
        Novo novo3 = new Novo("Rua Chile", 433_000);
        Novo novo4 = new Novo("rua fazer", 877_389);
        Novo novo5 = new Novo("Rua Viela", 557_000);
        Novo novo6 = new Novo("rua Pimba", 156_000);

        Novo novoa = new Novo("rua Pimba", 156_000);
        Novo novob = new Novo("rua Pimba", 969_696);


        System.out.println(novob.compareTo(novoa));


        List<Novo> listaNovo = new ArrayList<Novo>();
        listaNovo.add(novo1);
        listaNovo.add(novo2);
        listaNovo.add(novo3);
        listaNovo.add(novo4);
        listaNovo.add(novo5);
        listaNovo.add(novo6);

        Collections.sort(listaNovo);

        for (Novo novo : listaNovo) {
            System.out.println(novo);
        }


//
//        int resultado,resultado2,resultado3,resultado4,resultado5,resultado6;
//        String[] teste = new String[5];
//
//
//        resultado = novo3.compareTo(novo4);
//
//            if (resultado < 0) {
//                System.out.println(novo3 + " ," + novo4);
//                teste[0] = novo3 + " ," + novo4;
//
//            } else if (resultado > 0) {
//                System.out.println(novo4 + " ," + novo3);
//                teste[0] = novo4 + " ," + novo3;
//            } else {
//                System.out.println("igual");
//                teste[0] = "igual";
//            }
//        resultado2 = novo5.compareTo(novo6);
//
//        if (resultado2 < 0) {
//            System.out.println(novo5 + " ," + novo6);
//            teste[1] = novo5 + " ," + novo6;
//
//        } else if (resultado2 > 0) {
//            System.out.println(novo6 + " ," + novo5);
//            teste[1] = novo6 + " ," + novo5;
//        } else {
//            System.out.println("igual");
//            teste[1] = "igual";
//        }
//
//        resultado3 = novo4.compareTo(novo6);
//
//        if (resultado3 < 0) {
//            System.out.println(novo4 + " ," + novo6);
//            teste[2] = novo4 + " ," + novo6;
//
//        } else if (resultado3 > 0) {
//            System.out.println(novo6 + " ," + novo4);
//            teste[2] = novo6 + " ," + novo4;
//        } else {
//            System.out.println("igual");
//            teste[2] = "igual";
//        }
//
//        resultado4 = novo1.compareTo(novo3);
//
//        if (resultado4 < 0) {
//            System.out.println(novo1 + " ," + novo3);
//            teste[3] = novo1 + " ," + novo3;
//
//        } else if (resultado4 > 0) {
//            System.out.println(novo3 + " ," + novo1);
//            teste[3] = novo3 + " ," + novo1;
//        } else {
//            System.out.println("igual");
//            teste[3] = "igual";
//        }
//
//        resultado5 = novo5.compareTo(novo2);
//
//        if (resultado5 < 0) {
//            System.out.println(novo5 + " ," + novo2);
//            teste[4] = novo5 + " ," + novo2;
//
//        } else if (resultado5 > 0) {
//            System.out.println(novo2 + " ," + novo5);
//            teste[4] = novo2 + " ," + novo5;
//        } else {
//            System.out.println("igual");
//            teste[4] = "igual";
//        }
//
//        resultado6 = novo2.compareTo(novo4);
//
//        if (resultado6 < 0) {
//            System.out.println(novo2 + " ," + novo4);
//            teste[5] = novo2 + " ," + novo4;
//
//        } else if (resultado6 > 0) {
//            System.out.println(novo4 + " ," + novo2);
//            teste[5] = novo4 + " ," + novo2;
//        } else {
//            System.out.println("igual");
//            teste[5] = "igual";
//        }
//
//
//        Assert.assertEquals("Imovel{endereco='Rua Chile', preco=866000} ,Imovel{endereco='rua fazer', preco=1754778}", teste[0]);
//        Assert.assertEquals("Imovel{endereco='rua Pimba', preco=312000} ,Imovel{endereco='Rua Viela', preco=1114000}", teste[1]);
//        Assert.assertEquals("Imovel{endereco='rua Pimba', preco=312000} ,Imovel{endereco='rua fazer', preco=1754778}", teste[2]);
//        Assert.assertEquals("Imovel{endereco='Rua Santana', preco=712000} ,Imovel{endereco='Rua Chile', preco=866000}", teste[3]);
//        Assert.assertEquals("Imovel{endereco='rua whatever', preco=42000} ,Imovel{endereco='Rua Viela', preco=1114000}", teste[4]);
//        Assert.assertEquals("Imovel{endereco='rua whatever', preco=42000} ,Imovel{endereco='rua fazer', preco=1754778}", teste[5]);
//
//
//

    }
}

