package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Account;

public class AccountDAOImpl implements  AccountDAO{//account dao implementing account dao
	public static Map<Long,Account> accmap=new HashMap<Long,Account>();
	public boolean addAccount(Account ob) {
		accmap.put(ob.getMobile(),ob);
		return true;
	}
	
	
//logic written for all the methods add,update,delete,find,transfer
	
	
	
	@Override
	public boolean updateAccount(Account ob) {
		accmap.put(ob.getMobile(),ob);
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean deleteAccount(Account ob) {
		// TODO Auto-generated method stub
		accmap.remove(ob.getMobile());
		return true;
	}
	@Override
	public Account findAccount(Long mobileno) {
		Account ob=accmap.get(mobileno);
		// TODO Auto-generated method stub
		return ob;
	}
	@Override
	public Map<Long, Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accmap;
	}
	@Override
	public boolean transferMoney(Account from, Account to) {
		// TODO Auto-generated method stub
		accmap.put(from.getMobile(),from);
		accmap.put(to.getMobile(),to);
		
		return false;
	}}
