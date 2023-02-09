class A extends Thread 
{ 
public void run() 
{ 
for(int i=0;i<=10;i++) 
 System.out.print("Thread A: "+i); 
  System.out.println("\t");
} 
} 
class B extends Thread 
{ 
public void run() 
{ 
for(int i=0;i<=10;i++) 
 System.out.print("Thread B : "+i); 
} 
} 
class C  
{ 
public static void main(String []args) 
{ 
A a=new A();
 B b=new B();
 a.start(); 
 b.start(); 
} 
} 
