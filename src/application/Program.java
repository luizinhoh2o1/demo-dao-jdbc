package application;

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
		
	}

}
