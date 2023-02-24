package com.vbs.no2a.Nitrite;

import org.dizitart.no2.IndexType;
import org.dizitart.no2.objects.Id;
import org.dizitart.no2.objects.Index;
import org.dizitart.no2.objects.Indices;

import java.io.Serializable;
import java.util.Date;

@Indices({
        @Index(value = "joinDate", type = IndexType.NonUnique),
        @Index(value = "name", type = IndexType.Unique)
})
public class Employee implements Serializable {
    @Id
    private long empId;

    private Date joinDate;

    private String name;

    private Number Age;

    private Number Salary;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getAge() {return Age;}

    public void setAge(Number Age) {this.Age=Age;}

    public Number getSalary() {return Salary;}

    public void setSalary(Number Salary) {this.Salary=Salary;}
// ... public getters and setters
}
