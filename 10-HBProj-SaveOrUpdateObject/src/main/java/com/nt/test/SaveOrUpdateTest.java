package com.nt.test;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Membership;
import com.nt.utility.HibernateUtil;

public class SaveOrUpdateTest {

	public static void main(String[] args) {
		Session ses=null;
		Membership member=null;
		Transaction tx=null;
		boolean flag=false;
	     //get Session
		ses=HibernateUtil.getSession();
		//prepare object
		member=new Membership();
		//member.setMid(2);
		member.setName("yankie");
		member.setAddrs("new york");
		member.setRewardPoints(43);
		try {
			//begin Tx
			tx=ses.beginTransaction();
			   ses.saveOrUpdate(member);
			  flag=true;
		}//try
		catch(HibernateException he) {
			flag=false;
			he.printStackTrace();
		}
		finally {
			//perform tx mgmt
			 if(flag) {
				 tx.commit();
				 System.out.println("Object is saved or updated");
			 }
			 else {
				 tx.rollback();
				 System.out.println("Object is not saved or updated");
			 }
			 //close objs
			 HibernateUtil.closeSession(ses);
			 HibernateUtil.closeSessionFactory();
		}
		
		}//main
}//class
