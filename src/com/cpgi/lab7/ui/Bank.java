package com.cpgi.lab7.ui;

import java.util.LinkedList;

import com.cpgi.lab7.bean.Account;




public class Bank {

	LinkedList<Account> acc= new LinkedList<>();


public String CreateAccount(int accountNo, int amount)throws InsufficientBalanceOpeningException{
	if(amount<500)
	{
		throw new InsufficientBalanceOpeningException();
	}
       Account accs= new Account(accountNo, amount);
       acc.add(accs);
       return "account created";
       
	}
private Account SearchAccount(int accountNo)throws InvalidAccountNumberException
{
	for(Account accs:acc) {
		if(accs.getAccountNo()==accountNo)
		{
			return accs;
		}
	}
	
	throw new InvalidAccountNumberException();
	
	
	
}
public int Withdraw(int accountNo,int amount)throws InvalidAccountNumberException, InsufficientBalanceException
{ 
	Account acct= SearchAccount(accountNo);
	if(acct.getAmount()>=0)
	{
		acct.setAmount((int) (acct.getAmount()-amount));
		return (int) acct.getAmount();
	}
	throw new  InsufficientBalanceException();
}


public int Deposit(int accountNo, int amount) throws  InvalidAccountNumberException{
Account acct= SearchAccount(accountNo);
{
	acct.setAmount((int) (acct.getAmount()-amount));
	return  (int) acct.getAmount();
}

}
public int FundTransfer(int withAcc, int depAcc,int amount)throws InvalidAccountNumberException, InsufficientBalanceException
{
	Account a= SearchAccount(withAcc);
	Account b= SearchAccount(depAcc);
	Withdraw(withAcc, amount);
	Deposit(depAcc, amount);
	return (int) b.getAmount();


	
}

}