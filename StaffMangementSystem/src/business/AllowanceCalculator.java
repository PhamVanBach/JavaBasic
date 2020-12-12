package business;


import entity.EPosition;
import entity.Employee;
import entity.Staff;
import entity.Teacher;
import entity.EDegree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bachp
 */
public class AllowanceCalculator {
    public static float calculateAllowance(Employee emp){
        float allowance = 0;
        
        if(emp instanceof Staff){
            Staff s = (Staff) emp;
            //head/truong phong 2000
            if(s.getPosition() == EPosition.HEAD){
                allowance = 2000;
            }
            //VICE_HEAD/pho phong 1000
            else if(s.getPosition() == EPosition.VICE_HEAD){
                allowance = 1000;
            }
            //STAFF/nhan vien 500
            else if(s.getPosition() == EPosition.STAFF){
                allowance = 500;
            }
            
        }else if(emp instanceof Teacher){
            Teacher tc = (Teacher) emp;
            
            if(tc.getDegree() == EDegree.DOCTOR){
                allowance = 1000;
            }else if(tc.getDegree() == EDegree.MASTER){
                allowance = 500;
            }else if(tc.getDegree() == EDegree.BACHELOR){
                allowance = 300;
            }    
        }
        return allowance;
    }
}
