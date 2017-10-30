package pt.arvorerecusiva.main;

import pt.arvorerecusiva.ArvoreBinaria;

public class TesteArvore {
	
	public static void main(String[] args) {
		
		ArvoreBinaria ab = new ArvoreBinaria();
        System.out.println(ab);
        ab.inserir(5);
        System.out.println(ab);
        ab.inserir(10);
        System.out.println(ab);
        ab.inserir(15);
        System.out.println(ab);
        ab.inserir(2);
        System.out.println(ab);
        ab.inserir(4);
        System.out.println(ab);
        ab.inserir(6);
        System.out.println(ab);
        ab.inserir(8);
        System.out.println(ab);
        ab.inserir(20);
        System.out.println(ab);
        System.out.println(ab.soma());
		
		
	}

}
