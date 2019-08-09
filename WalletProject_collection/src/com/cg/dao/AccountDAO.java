package com.cg.dao;

import java.util.Map;

import com.cg.bean.Account;

public interface AccountDAO {
public boolean addAccount(Account ob);//method for addaccount
public boolean updateAccount(Account ob);//method for updateaccount

public boolean deleteAccount(Account ob);//method for deleteaccount

public Account findAccount(Long mobileno );//method for findaccount

public Map<Long,Account> getAllAccounts();//method for getallaccountaccount

public boolean transferMoney(Account from,Account to);//method for transfermoney


}
