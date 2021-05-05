package inheritance;

public class main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		TradeUnionCustomer tradeUnion = new TradeUnionCustomer();
		tradeUnion.customerNumber = "3369852";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = { engin, hepsiBurada, tradeUnion };   //polymorphism
		
		customerManager.addMultiple(customers);
		
		//customerManager.Add(hepsiBurada);
		//customerManager.Add(engin);
		//customerManager.Add(tradeUnion);

	}

}


