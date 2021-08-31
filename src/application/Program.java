package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sd = DaoFactory.createSellerDao();
		System.out.println("--- Teste 1 : Seller findById ---");
		Seller sel = sd.findById(3);
		
		System.out.println(sel);
	}

}
