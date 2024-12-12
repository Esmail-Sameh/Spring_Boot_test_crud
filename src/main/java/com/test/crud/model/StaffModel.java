
package com.test.crud.model;

public class StaffModel{
    
    private String staffName;
    private String staffAdress;
    private double staffSalary;

   


    public StaffModel(String staffName, String staffAdress, double staffSalary) {
        this.staffName = staffName;
        this.staffAdress = staffAdress;
        this.staffSalary = staffSalary;
    }
    

    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffAdress() {
        return this.staffAdress;
    }

    public void setStaffAdress(String staffAdress) {
        this.staffAdress = staffAdress;
    }

    public double getStaffSalary() {
        return this.staffSalary;
    }

    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }
    
}