package lingnuo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/19 10:06
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer emp_id;
    private String emp_name;
    private Double emp_salary;
}