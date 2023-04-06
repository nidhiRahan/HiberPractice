
package hiberP;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoManyExample {

	
	public static void main(String[] args) {
    Configuration cfg = new Configuration();
	cfg.configure("hiber.cfg.xml");
    SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	Dept d=new Dept();
	d.setDeptno(1);
	d.setDeptname("IT");
	Empt e1=new Empt();
	e1.setEmpid(1001);
	e1.setEmpname("nidhi");
	e1.setDeptid(1);
	Empt e2=new Empt();
	e2.setEmpid(1002);
	e2.setEmpname("sandhya");
	e2.setDeptid(1);
	Set st=new HashSet();
	st.add(e1);
	st.add(e2);
	d.setChildren(st);
	s.save(d);
	tx.commit();
	s.close();
	
	}

}
