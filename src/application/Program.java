package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST: findById Seller ===");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println("\n=== TEST: findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST: findAll ===");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST: Insert Seller ===");
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted, new id = " + newSeller.getId());
		
		System.out.println("\n=== TEST: Update Seller ===");
		seller = sellerDao.findById(18);
		seller.setName("Chris Rock");
		seller.setBaseSalary(6200.0);
		seller.setEmail("chris@hotmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST: Delete seller ===");
		System.out.print("Enter Id for delete seller: ");
		int id = scan.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Seller deleted!");
		
	}

}
