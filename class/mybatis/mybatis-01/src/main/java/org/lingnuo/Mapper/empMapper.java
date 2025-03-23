package org.lingnuo.Mapper;

import java.util.List;
import org.lingnuo.pojo.Emp;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/19 10:19
 * @Version 1.0
 */
public interface empMapper
{
    /**
     *查询用户信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/9/19 10:23
     */
    Emp selectByPrimaryKey(Integer id);
    List<Emp> selectAll();
}
