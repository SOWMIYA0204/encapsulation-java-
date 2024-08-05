package startproject;

 class MySchool {
	  
	private int fees;
	private int duration;
	private long mobile;
	
	public MySchool(int fees,int duration,long mobile) {
		 
		 this.fees=fees;
		 this.duration=duration;
		 this.mobile=mobile;
		
	}
	public int getFees() {
		return fees;
	}
	public int getDuration() {
		return duration;
	}
	public long getMobile() {
		return mobile;
	}

}
 class OmSaiRamPg{
	private  String breakFast;
	private  String lunch;
	private String dinner;
	private String date;
	public OmSaiRamPg(String breakFast,String lunch,String dinner,String date) {
		this.breakFast=breakFast;
		this.lunch=lunch;
		this.dinner=dinner;
		this.date=date;
	}
	public String getBreakFast() {
		return breakFast;
	}
	public String getLunch() {
			return lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public String getDate() {
		return date;
	}
	 	 
 }
 class Company{
	private  int salary;
	private int inHand;
	private String satisfaction;
	
	Company(int salary,int inHand,String satisfaction){
		this.salary=salary;
		this.inHand=inHand;
		this.satisfaction=satisfaction;
		
	}
	Company(int salary,int inHand){
		this.salary=salary;
		this.inHand=inHand;
	}
	Company(int salary){
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public int  getInHand() {
		return inHand;
	}
	public String getSatisfy() {
		return satisfaction;
	}
 }
public class Constructor{
	public static void main(String[] args) {
		MySchool s=new MySchool(100000,6,7094604546L);
		OmSaiRamPg pg=new OmSaiRamPg("Aloo Paratha","RICE SAMBAR","Pulavu","03-AUG-2024");
		Company c=new Company(76);
		System.out.println("FeeDetails::");
		System.out.println(s.getFees());
		System.out.println(s.getDuration());
		System.out.println(s.getMobile());
		System.out.println("-------------------------");
		System.out.println("PgFoodDetails::");
		System.out.println(pg.getBreakFast());
		System.out.println(pg.getLunch());
		System.out.println(pg.getDinner());
		System.out.println(pg.getDate());
		System.out.println("--------------------------");
		System.out.println("CompanyDetails::");
		System.out.println(c.getSalary());
		System.out.println(c.getInHand());
		System.out.println(c.getSatisfy());
		
	}
}
