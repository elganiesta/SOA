package client;

import java.rmi.RemoteException;

import sud.webservices.Product;
import sud.webservices.ProductsManagerImplProxy;

public class ClientSud {

	public static void main(String[] args) throws RemoteException {
		// Initialize some products
		ProductsManagerImplProxy productManager = new ProductsManagerImplProxy();
		Product produit1 = new Product(1, "T-shirt", 80); 
		Product produit2 = new Product(2, "Shoe", 50); 
		// add the products		
		productManager.addProduct(produit1);
		productManager.addProduct(produit2);
		// show products
		System.out.println("--- Show a product : ---");
		System.out.println("product id: "+productManager.getProduct(1).getId());
		System.out.println("product label: "+productManager.getProduct(1).getLabel());
		System.out.println("product price: "+productManager.getProduct(1).getPrice());
		// show all products
		System.out.println("--- Show all product : ---");
		for(int i=0; i<productManager.getProducts().length; i++) {
			System.out.println("id of "+ i + " : " + productManager.getProducts()[i].getId());
			System.out.println("label of "+ i + " : " + productManager.getProducts()[i].getLabel());
			System.out.println("price of "+ i + " : " + productManager.getProducts()[i].getPrice());
		}
		//  delete a product
		System.out.println("--- Delete product 2 : ---");
		productManager.deleteProduct(2);
		System.out.println("Deleted !");
	}

}
