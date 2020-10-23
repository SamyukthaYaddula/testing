
class Cal{
int z;
public void add(int x,int y){
z=x+y;
System.out.println("The sym of the given numbers:"+z);
}
public void sub(int x,int y){
z=x-y;
System.out.println("The sub of the given numbers:"+z);
}
public void mul(int x,int y){
z=x*y;
System.out.println("The mul of the given numbers:"+z);
}
}

public class MyCal extends Cal{
public static void main(String args[]){
int a=20;
int b=10;
MyCal d=new MyCal();
d.add(a,b);
d.sub(a,b);
d.mul(a,b);
}
}