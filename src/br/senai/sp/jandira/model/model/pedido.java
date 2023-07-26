package br.senai.sp.jandira.model.model;


import java.util.ArrayList;
import java.util.List;

public class pedido {
    public int numero;
    public cliente Cliente;
    
    public double total;
    public List<produto> Produtos = new ArrayList<>();

    public void mostrarPedido(){
        System.out.println("=========================");
        System.out.println("PEDIDO NO." + numero);
        System.out.println("=========================");
        System.out.println("CLIENTE: " + Cliente.nome);
        System.out.println("TELEFONE: " + Cliente.telefone);
        System.out.println("=========================");
        System.out.println("      ITENS DO PEDIDO"    );
        for (produto p : Produtos){
            System.out.println("---" + p.descricao);
        }
        System.out.println("=========================");

        System.out.println("TOTAL : R$" + total);

    }
}
