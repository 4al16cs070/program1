package pac; 

public class Student extends no{
int usn;
double marks;
Student(String name,int age,int usn,double marks)
{
	super(name,age);
	this.marks=marks;
	this.usn=usn;
}
}
