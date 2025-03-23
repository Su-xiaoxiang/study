package com.lingnuokeji.serivce;

import com.lingnuokeji.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/31 15:08
 * @Version 1.0
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    @Transactional(timeout = 1)
    public void changeStudentInfo(){
        studentDao.updateAgeById(1,20);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        studentDao.updateNameById(1,"2222");
    }
    @Transactional(rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED)
    public void change() throws FileNotFoundException {
        studentDao.updateAgeById(1,20);
        new FileInputStream("xxx");
        studentDao.updateNameById(1,"2222");
    }
}
