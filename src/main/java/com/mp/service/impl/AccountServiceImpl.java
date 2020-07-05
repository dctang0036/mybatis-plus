package com.mp.service.impl;

import com.mp.entity.Account;
import com.mp.dao.AccountMapper;
import com.mp.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dctang
 * @since 2020-07-05
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
