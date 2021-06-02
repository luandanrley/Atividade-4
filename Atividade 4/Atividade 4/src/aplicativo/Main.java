package aplicativo;

import java.util.ArrayList;
import java.util.List;

import aplicativo.*;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(27,"Noemia Francisca","11021031050","Gerente",3900.70, 0.20,"Recife",0); //Criar gerente
        Vendedor vendedor1 = new Vendedor(24,"Cláudio Gomes","11521531555","Vendedor", 1600.90, gerente,0,0.10,0);//Criar vendedor
        Vendedor vendedor2 = new Vendedor(26,"Ana Beatriz","98765432100","Vendedor", 1600.90, gerente,0,0.10,0);//Criar outro vendedor

        List<Vendas> vendas = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

       
        gerente.setVendedores(vendedores);

        
        Vendas vendas1 = new Vendas(1000);
        Vendas vendas2 = new Vendas(555);
        Vendas vendas3 = new Vendas(630);
        Vendas vendas4 = new Vendas(590);
        Vendas vendas5 = new Vendas(850);
        Vendas vendas6 = new Vendas(700);
        Vendas vendas7 = new Vendas(900);
        Vendas vendas8 = new Vendas(725);
        Vendas vendas9 = new Vendas(800);
        Vendas vendas10 = new Vendas(1500);

        //Adiciona as vendas a primeira lista de vendas
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);

        //Adiciona as vendas a segunda lista de vendas
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor1.setVendas(vendas);

        vendedor2.setVendas(vendas02);

        vendedor1.getTotalVendas();
        vendedor1.getTotalComissao();

        vendedor2.getTotalVendas();
        vendedor2.getTotalComissao();

        gerente.getComissaoTotalGerente();

        System.out.println();
        System.out.println("Primeiro Vendedor: " + vendedor1.getNome()+" "+vendedor1.getVendas()+ " " + "Salario R$ " + vendedor1.getSalario());
        System.out.println();
        System.out.println("Segundo Vendedor: " + vendedor2.getNome()+" "+vendedor2.getVendas()+ " " +  "Salario R$ " + vendedor2.getSalario());
        System.out.println();
        System.out.println("Gerente: " + gerente.getNome()+" "+gerente.getSalario());

    }
}
