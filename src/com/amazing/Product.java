package com.amazing;

public class Product {
	private int id;
	private String name;
	private String category_id;
	private float price;
	private int stock;
	
	protected Product() { //Default constructor
		String[] aux = new String[5];
		this.name = Filter.filter_s("Name of the product: ");
		this.id = Filter.filter_i("Id of the product: ", 0, 1000000);
		this.category_id = Filter.filter_s("Category of the product: ");
		this.price = Filter.filter_f("Value of the product (�): ", 0 , 10000);
		this.stock = Filter.filter_i("Stock of this product: ", 0 , 10000);
		
		aux[0] = "p_id=" + this.id;
		aux[1] = "p_name=" + this.name;
		aux[2] = "p_category=" + this.category_id;
		aux[3] = "p_price=" + this.price;
		aux[4] = "p_stock=" + this.stock;
		
		IO.write("d_product", aux, true);
	}
	
	protected Product(String[] data) { //Product data passed
		this.id = Integer.parseInt(data[0]);
		this.name = data[1];
		this.category_id = data[2];
		this.price = Float.parseFloat(data[3]);
		this.stock = Integer.parseInt(data[4]);
	}

	protected int r_id () {
		return this.id;
	}
	
	protected String r_name () {
		return this.name;
	}
	
	protected String r_category () {
		return this.category_id;
	}
	
	protected float r_price () {
		return this.price;
	}
	
	protected int r_stock () {
		return this.stock;
	}
	
	protected void print () {
		System.out.println("Product:\n\n");
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Category: " + this.category_id);
		if (Amazing.dollar_a)
			System.out.println("Price: " + this.price * Amazing.eur_dollar + "$");
		else
			System.out.println("Price: " + this.price + "�");
		System.out.println("Stock: " + this.stock);
	}
	
	protected String compare() {
		String aux = "";
		aux += this.category_id + "/";
		aux += this.id + "/";
		aux += this.name + "/";
		if (Amazing.dollar_a)
			aux += this.price * Amazing.eur_dollar + "$/";
		else
			aux += this.price + "�/";
		aux += this.stock;
		return aux;
	}

	protected void buy(int n_ordered) {
		this.stock -= n_ordered;
	}
}