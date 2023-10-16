package model;

import java.util.ArrayList;

public class RoteiroGastronomico {
	private ArrayList<Restaurante> lista;
	
	public RoteiroGastronomico() {
		lista = new ArrayList<Restaurante>();
		lista.add(new Restaurante("Figueira Rubayat",5,4));
		lista.add(new Restaurante("DOM",5,5));
		lista.add(new Restaurante("Ponto Chic",3,2));
		lista.add(new Restaurante("Butantan Food Park",3,2));
		lista.add(new Restaurante("Coco Bambu",3,3));
		lista.add(new Restaurante("Estadao Bar e Lanches",3,2));
	}

	public ArrayList<Restaurante> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Restaurante> lista) {
		this.lista = lista;
	}
}