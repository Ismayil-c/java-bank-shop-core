package az.bankshop.model;

public class BasketItem {
	  private Product product;
	    private double quantity;

	    public BasketItem(Product product, double quantity) {
	        this.product = product;
	        this.quantity = quantity;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public double getQuantity() {
	        return quantity;
	    }

	    public double getTotalPrice() {
	        return product.getPrice() * quantity;
	    }
}
