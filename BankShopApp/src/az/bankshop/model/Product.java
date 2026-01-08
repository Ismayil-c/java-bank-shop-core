package az.bankshop.model;

public class Product {
	 private String name;
	    private double price;
	    private double stock;

	    public Product(String name, double price, double stock) {
	        this.name = name;
	        this.price = price;
	        this.stock = stock;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public double getStock() {
	        return stock;
	    }

	    public boolean hasEnoughStock(double quantity) {
	        return stock >= quantity;
	    }

	    public void decreaseStock(double quantity) {
	        stock -= quantity;
	    }

	    @Override
	    public String toString() {
	        return name + " | Price: " + price + " | Stock: " + stock;
	    }
}
