package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.Employee;
import com.demo.enums.City;
import com.demo.enums.Gender;
import com.demo.repo.EmployeeRepository;

@SpringBootApplication
public class SpringbootJpa12Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa12Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");

		saveEmp();
		saveEmp();
		saveEmp();

		getAllEmps();

		findEmp(4);
		findEmp(2);
		
		updateEmp(2);
		
		removeEmp();
	}

	private void removeEmp() {
		repo.deleteById(1);
		Employee emp = findEmp(2);
		repo.delete(emp);
	}

	private void updateEmp(int id) {
		Employee emp = findEmp(id);

		emp.setEmail("demo@gmail.com");
		emp.setCity(City.MUMBAI);
		
		repo.save(emp);
		
	}

	private Employee findEmp(int id) {
		/*
		 * Optional<Employee> optional = repo.findById(id); if(optional.isPresent()) {
		 * Employee employee = optional.get(); System.out.println(employee); } else {
		 * System.out.println("Emp not found"); }
		 */

		Employee employee = repo.findById(id).orElse(null);
		System.out.println("Employee with id "+id+" is " + employee);
		return employee;
	}

	private void saveEmp() {
		Employee emp = new Employee();
		emp.setGender(Gender.Female);
		emp.setName("Atul");

		repo.save(emp);

	}

	private void getAllEmps() {

		Iterable<Employee> findAll = repo.findAll();

		/*
		 * findAll.forEach(emp->{ System.out.println(emp); });
		 */
		List<Employee> list = new ArrayList<Employee>();

		/*
		 * findAll.forEach((emp)->{ list.add(emp); });
		 */
		findAll.forEach(list::add);

		System.out.println(list);
	}

}
