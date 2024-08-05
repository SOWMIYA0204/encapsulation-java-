package startproject;


 class BankAccount{
	private int accno;
	private int bal;
	
		  
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
}
 class School{
	 private int idno;
	 private String name;
	 public void setId(int idno) {
		 this.idno=idno;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public int getId() {
		 return idno;
	 }
	 public String getName() {
		 return name;
	 }
	 
 }
 class College{
	 private int clgrollNo;
	 private int hostelId;
	 public void setRollno(int clgrollNo) {
		 this.clgrollNo=clgrollNo;
		 
	 }
	 public void setId(int hostelId) {
		 this.hostelId=hostelId;
	 }
	 public int getRollno() {
		 return clgrollNo;
		 
	 }
	 public int getId() {
		 return hostelId;
	 }
 }
//void bank(int accno,int bal) {
//
//   this.accno=accno;
//   this.bal=bal;
//}
//}
	
public class Encapsulation {
	public static void main(String [] args) {
	   BankAccount ba=new BankAccount();
	   School scl=new School();
	   College clg=new College();
	   
	   ba.setAccno(1111);
	   ba.setBal(500000);
	   scl.setId(93);
	   scl.setName("SOWMIYA");
	   clg.setRollno(92);
	   clg.setId(1);
	   
	     System.out.println(ba.getAccno());
	     System.out.println(ba.getBal());
	     System.out.println(scl.getId());
	     System.out.println(scl.getName());
	     System.out.println(clg.getRollno());
	     System.out.println(clg.getId());
	   
		
	}

}
