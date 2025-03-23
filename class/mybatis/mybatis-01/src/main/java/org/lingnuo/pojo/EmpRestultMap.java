package org.lingnuo.pojo;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/26 9:27
 * @Version 1.0
 */
public class EmpRestultMap {
    private Integer empId;
    private String empName;
    private String empSalary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "EmpRestultMap{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary='" + empSalary + '\'' +
                '}';
    }
}
