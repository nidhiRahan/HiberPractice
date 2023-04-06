package hiberP;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CreteriaExample {

	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Criteria ct=s.createCriteria(PojoClass.class);
	  //  Criterion ct1=Restrictions.gt("rno",1002);
	    //Criterion ct1=Restrictions.lt("rno",1006);
	   // Criterion ct1=Restrictions.like("name","%y%");
	    Criterion ct1=Restrictions.like("name", "k%");
	    ct.add(ct1);
	    List lst= ct.list();
		Iterator it=lst.iterator();
		while(it.hasNext()) {
		PojoClass st=(PojoClass)it.next();
			System.out.println(st.getRno()+" "+st.getName());
		}
		s.close();
	}

}

