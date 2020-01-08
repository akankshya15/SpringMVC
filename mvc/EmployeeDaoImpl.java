package mvc;

import org.springframework.stereotype.Repository;
import beans.Employee;

import java.util.ArrayList;
import  java.util.List;
@Repository
public class EmployeeDaoImpl {

	public List<Employee> getEmpls(){
		List<Employee> emplist= new ArrayList<Employee>();
		emplist.add(new Employee(101,"aaaa",5000));
		emplist.add(new Employee(102,"bbbb",6000));
		emplist.add(new Employee(103,"cccc",8000));
		
		return emplist;
		
	}
}