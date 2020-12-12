/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.Employee;
import entity.Staff;
import entity.Teacher;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bachp
 */
public class EmployeeManagement {
    //store all staff/teacher
    private ArrayList<Employee> listE;
    
    public EmployeeManagement(){
        listE = new ArrayList<>();
    }
    
    public void addEmployee(Employee emp){
        listE.add(emp);
    }
    //store all staff/teacher's name
    public ArrayList<Employee> searchByName(String name){
//        store all matching staff or teacher
        ArrayList<Employee> empFound = new ArrayList<>();
        
        //check null or empty
        if(name == null || name.trim() == ""){
            return empFound;
        }
        //duyet tat ca mang de so sanh 
        //su dung  method contains() de kiem tra su ton tai cua 1  chuoi trong 1 chuoi khac.
        for(Employee employee : listE){
            if(employee.getFullName().toUpperCase().contains(name.toUpperCase())){
                empFound.add(employee);
            };
        }
        
        return empFound;
    }
    
    //search by staff/teacher's department/falcuty
    
    public ArrayList<Employee> searchByDepartment (String dept){
        ArrayList<Employee> empFound = new ArrayList<>();
        Staff s = null;
        Teacher tc = null;
        String name = null;
        
        for(Employee employee : listE){
            if(employee instanceof Staff){
                s = (Staff) employee;
                //lay ve phong ban cua Staff
                name = s.getDepartment();
            }else if(employee instanceof Teacher){
                tc = (Teacher) employee;
                //lay ve phong ban cua teacher
                name = tc.getFaculty();
            }
            //check dept name
            if(name.toUpperCase().contains(dept.toUpperCase())){
                empFound.add(employee);
            }
        }
        return empFound;
    }
    
    public ArrayList<Employee> listAll(){
        Collections.sort(listE);
        return listE;
    }
}
