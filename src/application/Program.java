package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		System.out.println("--- Teste 1 : Seller findById ---");
		Seller sel = sd.findById(3);
		System.out.println(sel);
		
		System.out.println("--- Teste 2 : Seller findByDepartment ---");
		Department dep = new Department(2, null);
		List<Seller> list = sd.findByDepartment(dep);
		
		for (Seller seller: list) {
			System.out.println(seller);
		}
		
		System.out.println("--- Teste 3 : Seller findAll ---");
		list = sd.findAll();
		
		for (Seller seller: list) {
			System.out.println(seller);
		}
		
		System.out.println("--- Teste 4 : Seller insert ---");
		Seller newSeller = new Seller(null, "Sam", "sam@gmail.com", new Date(), 2000.0, dep);
		sd.insert(newSeller);
		System.out.println("Inserted! New id= " + newSeller.getId());
		
	}

}
