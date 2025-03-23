package org.example.mapper;

import org.example.pojo.Order;
import java.util.List;
/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/28 14:45
 * @Version 1.0
 */
public interface OrderMapper {
     Order queryOrdersByUserId(Integer id);
}
