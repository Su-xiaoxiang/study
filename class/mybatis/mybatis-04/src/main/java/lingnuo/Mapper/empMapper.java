package lingnuo.Mapper;

import lingnuo.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    List<Emp> selectAll(@Param("name") String name, @Param("salary") Double salary);
    Integer update(@Param("name") String name, @Param("salary") Double salary, @Param("id") Integer id);
    List<Emp> selectByidList(@Param("ids") List<Integer> ids);

    /**
     *批量删除
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/10 15:19
     */
    int delectById(@Param("ids") List<Integer> ids);
    int insertEmpList(@Param("empList") List<Emp> empList);
    int updateBatch(@Param("empList") List<Emp> empList);
}
