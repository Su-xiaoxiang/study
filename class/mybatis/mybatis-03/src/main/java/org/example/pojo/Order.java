package org.example.pojo;

import lombok.Data;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/28 14:44
 * @Version 1.0
 */
@Data
public class Order {
   private Integer orderId;
   private String orderName;
   private Integer customerId;
   private Customer customer;
}
