package br.senai.sp.jandira;

import br.senai.sp.jandira.model.model.cliente;
import br.senai.sp.jandira.model.model.pedido;
import br.senai.sp.jandira.model.model.produto;

public class App {
    public static void main(String[] args) {

        produto p1 = new produto();
        produto p2 = new produto();
        produto p3 = new produto();


        p1.descricao = "Mouse blu-tooth";
        p1.valor = 100.0;

        p2.descricao = "Teclado ABNT2";
        p2.valor = 15.99;

        p3.descricao = "Pendrive";
        p3.valor = 189.99;

        cliente c1 = new cliente();
        c1.nome = "fabi";
        c1.telefone = "(11)6699999";
        c1.email = "fabi@gmail.com";


        pedido pd1 = new pedido();
        pd1.Cliente = c1;
        pd1.numero = 1;
        pd1.total = 500.0;
        pd1.Produtos.add(p3);
        pd1.Produtos.add(p3);
        pd1.Produtos.add(p3);
        pd1.Produtos.add(p3);
        pd1.Produtos.add(p3);
        pd1.Produtos.add(p3);

        pd1.mostrarPedido();
    }
}
