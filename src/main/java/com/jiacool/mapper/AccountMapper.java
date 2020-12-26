package com.jiacool.mapper;

import com.jiacool.domain.Account;

import java.util.List;

public interface AccountMapper {
//    1.保存账户数据
    public void save(Account account);

//    2.查询账户数据
    public List<Account> findAll();
}
