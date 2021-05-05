package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Makarna";
		product.id = 101;
		product.description = "Filiz Makarna";
		product.price = 4.5;
		product.stockAmount = 150;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	
	}

}
