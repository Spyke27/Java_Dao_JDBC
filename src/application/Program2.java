package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	static DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

	public static void main(String[] args) {
		
		Department newDepartment = new Department(5, "Developer");
		departmentDao.insert(newDepartment);
		System.out.println("\n=== TEST: Insert new Department ===");
		System.out.println("Inserted, new id = " + newDepartment.getId());
		
		
		
		
		

	}

}
