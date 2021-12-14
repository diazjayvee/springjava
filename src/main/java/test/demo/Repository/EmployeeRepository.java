/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.demo.Entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
   //represents a repository for employees
}
