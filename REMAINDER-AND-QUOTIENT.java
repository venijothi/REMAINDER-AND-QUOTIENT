# REMAINDER-AND-QUOTIENT
package oxygen.com;
import java.util.Scanner;
public class Req {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers a and b:");
int a=s.nextInt();
int b=s.nextInt();
if(a>=b) {
int c;
int d;
d=a/b;
System.out.print("the quotient is:");
System.out.println(d);
c=a%b;
System.out.print("the remainder is:");
System.out.println(c);
}
}
}
OUTPUT:
enter the numbers a and b:
46
5
the quotient is:9
the remainder is:1

