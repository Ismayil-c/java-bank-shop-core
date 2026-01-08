package az.bankshop;

import az.bankshop.bank.BankAccount;
import az.bankshop.model.BasketItem;
import az.bankshop.model.Product;
import az.bankshop.service.ShopService;

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		 BankAccount account = new BankAccount(100);

	        Product apple = new Product("Apple", 3.2, 10);
	        Product banana = new Product("Banana", 10, 10);

	        List<BasketItem> basket = new ArrayList<>();
	        basket.add(new BasketItem(apple, 2.5));
	        basket.add(new BasketItem(banana, 3));

	        ShopService shopService = new ShopService();
	        shopService.buy(account, basket);

	        System.out.println("Remaining balance: " + account.getBalance());

	}

}
