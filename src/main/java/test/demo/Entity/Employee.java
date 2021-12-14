/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.demo.Entity;


import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name = "tbl_employees")
public class Employee implements Serializable{
    //this class represents the employee entity table itself in API level
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for autoincrement of id
    private Long employeeId;
    private String name;
    private String location;
    private String department;
    
    public Employee(Long id, String name, String location, String department){
        this.employeeId = id;
        this.name = name;
        this.location = location;
        this.department = department;
    }
    
    public Employee(){
        
    }
    /**
     * @return the Id
     */
    public Long getId() {
        return employeeId;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.employeeId = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}
