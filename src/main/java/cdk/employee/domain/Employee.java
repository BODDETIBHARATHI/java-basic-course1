package cdk.employee.domain;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Float employeeSalary;

    public void setEmployeeId(Integer employeeId){
        this.employeeId = employeeId;
    }

    public Integer getEmployeeId(){
        return this.employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }
    public void setEmployeeSalary(Float employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public Float getEmployeeSalary(){
        return this.employeeSalary;
    }

}
