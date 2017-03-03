
public class EqualsNormal {
	
	String name;
	EqualsNormal(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		
		EqualsNormal norm1 = new EqualsNormal("mohan");
		EqualsNormal norm2 = new EqualsNormal("mohan");
		System.out.println("print if hashcode are equal " +norm1.equals(norm2));
		System.out.println("norm1: "+norm1.hashCode() + " norm2: "+norm2.hashCode());
		// TODO Auto-generated method stub

	}
	public boolean equals(Object obj){
		if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){
               return false;
        }
		EqualsNormal suri = (EqualsNormal)obj;
		return this.name == suri.name;
		
	}
	
	public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
	}

}
