package com.matera;

public abstract class Imovel implements Comparable<Imovel> {

    public String endereco;
    public int preco;

    public Imovel(String endereco, int preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public void showAddress() {
        System.out.println(getPreco());
    }

    public void showValue() {
        System.out.println(getPreco());
    }

    public String getEndereco() {
        return endereco;
    }

    public int getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imovel imovel = (Imovel) o;

        if (preco != imovel.preco) return false;
        return endereco != null ? endereco.equals(imovel.endereco) : imovel.endereco == null;

    }

    @Override
    public int hashCode() {
        int result = endereco != null ? endereco.hashCode() : 0;
        result = 31 * result + preco;
        return result;

        }

    public int compareTo(Imovel temp) {

        return new Integer(this.preco).compareTo(temp.getPreco());
    }
}