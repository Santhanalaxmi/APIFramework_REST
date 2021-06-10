package demoInheritance;

 class Teacher{
	private String designation="Teaching";
	protected String getDes() {
		return designation;
	}
	protected void setDes(String des) {
		this.designation=des;
	}
	void designation() {
		System.out.println("Designation:"+designation);
	}
}
class CompTeacher extends Teacher{
	private String Subject="Computer";
	protected String getSub() {
		return Subject;
	}
	protected void setSub(String sub) {
		this.Subject=sub;
	}
	void Subject() {
		System.out.println("Subject:"+Subject);
	}
}





public class InheritanceExample extends Teacher{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InheritanceExample ex=new InheritanceExample();
System.out.println(ex.getDes());
//System.out.println(ex.getSub());
ex.designation();
//ex.Subject();
	}
	

}
