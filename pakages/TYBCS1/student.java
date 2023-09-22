package TYBCS1;

public class student {
  int rno;
  String name;
  float per;

 public student(int rno1,String name1,float per)
 {
    rno=rno1;
    name=name1;
    this.per=per;
 }   
 public void disp()
 {
    System.out.println(rno+"\t"+name+"\t"+per);
 }
}
