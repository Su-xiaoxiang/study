package org.example.pojo;

import lombok.Data;

import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/28 14:43
 * @Version 1.0
 */
@Data
public class Customer {
    private Integer customerId;
    private String customerName;
    private List<Order> orderList;
}
