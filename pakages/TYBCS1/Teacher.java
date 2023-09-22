package TYBCS1;

public class Teacher {
    int id;
   public String name,sub;
  
   public Teacher(int id,String name,String sub)
   {
      this.id=id;
      this.name=name;
      this.sub=sub;
   }   
   public void disp()
   {
      System.out.println(id+"\t"+name+"\t"+sub);
   }
  
}
