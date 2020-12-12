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
public class Staff extends Employee{
    private String department;// ten phong ban
    private float noOfWorkingDay;// So ngay lam viec
    private EPosition position;// chuc vu: truong phong/pho phong/nhan vien

    public Staff() {
    }

    @Override
    public float getSalary() {
        float sal;
        sal = this.getSalaryRatio() * 730 + this.noOfWorkingDay * 30;
        return sal;
    }

    @Override
    public String toString() {
        return this.getFullName() + ", " + this.getDepartment() + ", " + this.getPosition() + ", "
                + this.getSalaryRatio() + ", " + this.getAllowance() + ", " + getNoOfWorkingDay() + ", " + this.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getNoOfWorkingDay() {
        return noOfWorkingDay;
    }

    public void setNoOfWorkingDay(float noOfWorkingDay) {
        this.noOfWorkingDay = noOfWorkingDay;
    }

    public EPosition getPosition() {
        return position;
    }

    public void setPosition(EPosition position) {
        this.position = position;
    }
    
    
    
}
