package com.curso.estruturadados.vetor.teste;

import java.util.Iterator;

import com.curso.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);

		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");

		vetor.printar();
	}
}
