package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Books");
		System.out.println(dep);
		Seller seller = new Seller(22, "Sann", "sann@gmail.com", new Date(), 1000.0, dep);
		System.out.println(seller);
		
	}

}
