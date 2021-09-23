package entities;

public class Product {//a classe product � um object

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString () {//usa porque para ler o Product sozinho precisa converter em string
		return name //vai retornar o product com essas configura��es abaixo 
				+ ", $ "
				+ String.format("%.2f", price) //para converter valor em 2 casas decimais
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}

