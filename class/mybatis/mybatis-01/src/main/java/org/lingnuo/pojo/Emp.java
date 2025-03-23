package org.lingnuo.pojo;

import java.util.Objects;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/19 10:06
 * @Version 1.0
 */
public class Emp {
    private Integer emp_id;
    private String emp_name;
    private String emp_salary;

    @Override
    public String toString() {
        return "Emp{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary='" + emp_salary + '\'' +
                '}';
    }

    public String getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(String emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
}
