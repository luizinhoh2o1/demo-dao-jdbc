package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("--- Teste 1 : Department insert ---");
		Department dep = new Department(null, "AAAAA");
		depDao.insert(dep);
		System.out.println("Inserted!");
		
		System.out.println("--- Teste 2 : Department findById ---");
		dep = depDao.findById(1);
		System.out.println("Found department: " + dep);
		
		System.out.println("--- Teste 3 : Department update ---");
		dep = depDao.findById(7);
		dep.setName("Hello");
		depDao.uptade(dep);
		System.out.println("Update completed!");
		
		System.out.println("--- Teste 4 : Department deleteById ---");
		depDao.deleteById(8);
		System.out.println("Delete completed!");
		
		System.out.println("--- Teste 5 : Department findAll ---");
		List<Department> list = depDao.findAll();
		
		for (Department depList : list) {
			System.out.println(depList);
		}
		
	}

}
