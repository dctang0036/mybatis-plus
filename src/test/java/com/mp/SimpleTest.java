package com.mp;

import com.mp.dao.AccountMapper;
import com.mp.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void simpleTest() {
        List<Account> list = accountMapper.selectList(null);
        for (Account a : list) {
            System.out.println(a.toString());
        }
    }
}
