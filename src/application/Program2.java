package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	static DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("\n=== TEST: findById Department ===");
//		Department department = departmentDao.findById(5);
//		System.out.println(department);
//		
//		System.out.println("\n=== TEST: Insert new Department ===");
//		Department newDepartment = new Department(5, "Developer");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted, new id = " + newDepartment.getId());
		
//		System.out.println("\n=== TEST: Update Department ===");
//		System.out.print("Which department you want to change (Id): ");
//		int id = scan.nextInt();
//		System.out.print("New name: ");
//		String nome = scan.next();
//		department = departmentDao.findById(id);
//		department.setName(nome);
//		departmentDao.update(department);
		
//		System.out.println("\n=== TEST: findAll Department ===");
//		List<Department> list = departmentDao.findAll();
//		for(Department dep: list) {
//			System.out.println(dep);
//		}
		
		System.out.println("\n=== TEST: Delete Department ===");
		System.out.print("Enter id for delete department: ");
		int id = scan.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department id = " + id + " deleted!");
		
		
		
		scan.close();
	}

}
