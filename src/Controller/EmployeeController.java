package Controller;

import Model.Employee;
import Service.EmployeeService;

public class EmployeeController {

    EmployeeService service = new EmployeeService();

    public Employee addEmployee(Employee employee){
        return service.addEmployee(employee);
    }

    public Employee getEmployeeById(String id){
        return service.getEmployeeById(id);
    }

    public Employee updateEmployeeById(String id, Employee employee){
        return service.updateEmployeeById(id, employee);
    }

    public Employee deleteEmployeeById(String id){
        return service.deleteEmployeeById(id);
    }




}
