class Student{
String name,city,colour,branch,movie,device;
int age,year;

void givingSpeech(){
System.out.println(name+" from "+city+" of age "+age+" giving speech");
}
void climbingMountain(){
System.out.println(name+" from "+city+" of age "+age+" climbing Mountain");
}
void graduated(){
System.out.println(name+" from "+branch+" "+year+" graduated");
}
void driving(){
System.out.println(name+" driving "+colour+" colour car");
}
void watching(){
System.out.println(name+" watching "+movie+" in " +device);
}

public static void main(String args[]){
  Student s=new Student();
  s.name="Sachin";
  s.city="INDIA";
  s.age=16;
  s.givingSpeech();
 
  Student k=new Student();
  k.name="Ganesh";
  k.city="Banglore";
  k.age=24;
  k.climbingMountain();
 
  Student l=new Student();
  l.name="Pooja";
  l.colour="red";
  l.driving();

  Student j=new Student();
  j.name="Vikrant";
  j.branch="Mechanical Enginering";
  j.year=2020;
  j.graduated();
 
  Student p=new Student();
  j.name="Abhi";
  j.device="Mobile";
  j.movie="KGF";
  j.watching();
  
}
}