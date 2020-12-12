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
public class Teacher extends Employee{
    private String faculty; //Ten khoa lam viec
    private EDegree degree; //Trinh Do(tien si/thac si/cu nhan)
    private int teachingHours;//So gio giang day

    @Override
    public float getSalary() {
        float sal;
        sal = this.getSalaryRatio() * 730 + this.getAllowance() + this.teachingHours * 45;
        return sal;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return this.getFullName() + ", " + this.getFaculty() + ", " + this.getDegree() + ", "
                + this.getSalaryRatio()+ ", " + this.getAllowance() + ", " + this.getTeachingHours() + this.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public EDegree getDegree() {
        return degree;
    }

    public void setDegree(EDegree degree) {
        this.degree = degree;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }
    
    
}
