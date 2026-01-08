package az.bankshop.service;

import az.bankshop.bank.BankAccount;
import az.bankshop.model.BasketItem;

import java.util.List;

public class ShopService {
	 public void buy(BankAccount account, List<BasketItem> basket) {

	        double total = calculateTotal(basket);

	        if (!account.canPay(total)) {
	            System.out.println("Balance is not enough");
	            return;
	        }

	        for (BasketItem item : basket) {
	            if (!item.getProduct().hasEnoughStock(item.getQuantity())) {
	                System.out.println(item.getProduct().getName() + "there is not enough stock for you. ");
	                return;
	            }
	        }

	        account.pay(total);

	        for (BasketItem item : basket) {
	            item.getProduct().decreaseStock(item.getQuantity());
	        }

	        System.out.println("The purchase was successful. Payment:" + total);
	    }

	    private double calculateTotal(List<BasketItem> basket) {
	        double sum = 0;
	        for (BasketItem item : basket) {
	            sum += item.getTotalPrice();
	        }
	        return sum;
	    }
}
