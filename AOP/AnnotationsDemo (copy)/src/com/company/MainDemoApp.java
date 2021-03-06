package com.company;

import com.luv2code.aopdemo.Account;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainDemoApp {

    public static void main(String[] args) {
	// write your code here
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO=context.getBean("accountDAO",AccountDAO.class);
        accountDAO.addAccount(new Account(),true);
        accountDAO.doWork();

        MembershipDAO membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);
        membershipDAO.addAccount();
        membershipDAO.goToSleep();

        context.close();

    }
}
