package com.lanchonete.projeto.models;

import java.util.ArrayList;

public class Venda {
    private int id;
    private int total;
    //ArrayList<Produto> produtos = new ArrayList<produto> ()
    public Venda(int id, int total) {
        this.id = id;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
         this.total = total;
    }

    //public ArrayList<Produto> getProdutos()
    //public ArrayList<Produto> setProdutos ()

    @Override
    public String toString() {
        return "";
    }

}
