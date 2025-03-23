package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/26 10:26
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    private Integer id;
    private String username;
    private String password;
}
