
 
package hiberP;

import java.util.Set;

public class Dept {
        private int deptno;
		private String deptname;
		private Set children;
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public String getDeptname() {
			return deptname;
		}
		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}
		public Set getChildren() {
			return children;
		}
		public void setChildren(Set children) {
			this.children = children;
		}
		
	

}
