package NotSistemi;

public class Course {
	String Cname;
	String code,prefix;//prefix = branch olmalý
	int note,sozlu;
	Teacher courseTeacher;
	public Course(String Cname, String code, String prefix)
	{
		this.Cname=Cname;
		this.code=code;
		this.note=0;
		this.prefix=prefix;
		this.sozlu=0;
		
		
		
	}
	public void addTeacher(Teacher t) {//branch = bölüm
		if(this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println("iþlem baþarýlý");
		}else {
			System.out.println(t.tName + " bu dersi veremez");
		}
		
	}
	public void printTeacher() {
		if(courseTeacher != null) {
			System.out.println(this.Cname + " dersinin öðretmeni: "+ courseTeacher.tName);
		}else {
			System.out.println(this.Cname + " dersine öðretmen atanmamýþtýr");
		}
		
	}

}
