/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author bachp
 */
public abstract class Employee implements Comparable<Employee>{
    private String fullName;
    private float salaryRatio;//he so luong
    private float allowance;// phu cap
    //get luong
    public abstract float getSalary();
    //so sanh ten
    @Override
    public int compareTo(Employee emp) {
        return this.fullName.compareTo(emp.fullName); //To change body of generated methods, choose Tools | Templates.
    }
    
    //getter setter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(float salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    public float getAllowance() {
        return allowance;
    }

    public void setAllowance(float allowance) {
        this.allowance = allowance;
    }
        
}
