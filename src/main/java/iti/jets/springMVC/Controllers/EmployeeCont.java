package iti.jets.springMVC.Controllers;

import iti.jets.springMVC.Repo.Entities.Employee;
import iti.jets.springMVC.Services.EmployeeService;
import jakarta.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeCont {
    @Autowired
    private EmployeeService empServ;

    public EmployeeCont(){

    }



    // @PostMapping(value = "/addemp" , consumes = "application.json",produces ="application.json" )
    // public List<Employee> addEmployee(@RequestBody Employee emp){
    //     System.out.println(emp);
    //     // return empServ.getAllEmployee();
    //     empServ.addEmployee(emp.getAge(), emp.getName(), emp.getDepartment());
    //     return empServ.getAllEmployee();
    // }
    @PostMapping(value = "/addemp" )
    public String addEmployee(){
        System.out.println(5);
        // return empServ.getAllEmployee();
        // empServ.addEmployee(emp.getAge(), emp.getName(), emp.getDepartment());
        // return empServ.getAllEmployee().get(0).getName();
        return "test";
    }

    @GetMapping("/allemps")
    public List<Employee> getEmployees(){
        return empServ.getAllEmployee();
    }

    @GetMapping("/empbyname/{name}")
    public Employee getEmployee(@PathVariable String name){
        return empServ.findEmployee(name);
    }
}
