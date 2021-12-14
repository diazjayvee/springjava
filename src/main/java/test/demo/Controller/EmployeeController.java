/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo.Entity.Employee;
import test.demo.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employee") //base url of this class
@CrossOrigin("*") //to accept any requests
public class EmployeeController {
    
    //General process is first making the required CRUD method in here, then in react, we make a method in service, which we can call as a promise whenever we need to
    
    
    
    @Autowired
    private EmployeeRepository empRepo;
    
    @GetMapping("/employees") //this means : to show all employees, type localhost:8080/api/v1/employee/employees. this is also used for react
    public List<Employee> getAll(){
        return empRepo.findAll();
    }
    
    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return empRepo.save(employee);
    }
    
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return empRepo.findById(id).get();
    }
    
    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee employee){
        return empRepo.save(employee);
    }
    @DeleteMapping("employees/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long id){
        empRepo.deleteById(id); //deletes record in database
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT); //returns no content
    }
}
