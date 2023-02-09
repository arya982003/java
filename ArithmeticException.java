
class ArithmeticException 
{ 
public static void main(String []args) 
{ 
try 
{ 
int a=30,b=0; int c=a/b; 
System.out.println("result = "+c); 
} 
catch(ArithmeticException e) 
{ 
System.out.println("can't be divide by 0"); 
} 
} 
} 
