package org.example.mapper;

import org.example.pojo.Customer;
import java.util.List;
/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/28 16:26
 * @Version 1.0
 */
public interface CustomerMapper {
    List<Customer> selectAll(int id);
}
