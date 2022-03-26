package com.chengxiang.springcloud.service;

import com.chengxiang.springcloud.mapper.AccountDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public void decrease(Long userId, BigDecimal money) {
        log.info("------->account-service中扣减账户余额开始");
        accountDao.decrease(userId,money);
        log.info("------->account-service中扣减账户余额结束");
    }
}
