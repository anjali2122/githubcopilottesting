package Service;

import Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
     public List<Employee> listEmployee = new ArrayList<>();

    public Employee addEmployee(Employee employee){
        listEmployee.add(employee);
        return employee;
    }

    public List<Employee> getListEmployee(){
        return listEmployee;
    }

    public Employee getEmployeeById(String id){
        for(Employee employee : listEmployee){
            if(employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }

    public Employee updateEmployeeById(String id, Employee employee){
        for(Employee employee1 : listEmployee){
            if(employee1.getId().equals(id)){
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());
                employee1.setPhone(employee.getPhone());
                return employee1;
            }
        }
        return null;
    }

    public Employee deleteEmployeeById(String id){
        for(Employee employee : listEmployee){
            if(employee.getId().equals(id)){
                listEmployee.remove(employee);
                return employee;
            }
        }
        return null;
    }
}
