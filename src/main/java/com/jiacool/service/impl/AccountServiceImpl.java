package com.jiacool.service.impl;

import com.jiacool.domain.Account;
import com.jiacool.mapper.AccountMapper;
import com.jiacool.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public void save(Account account) {
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
//            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sessionFactory.openSession(true);
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            mapper.save(account);
//            sqlSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        accountMapper.save(account);

    }

    public List<Account> findAll() {
//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
//            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sessionFactory.openSession(true);
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            List<Account> accountList = mapper.findAll();
//            sqlSession.close();
//            return accountList;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
        return accountMapper.findAll();
    }
}
