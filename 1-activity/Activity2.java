import java.util.*;

class st{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String P1=sc.nextLine();
String P2=sc.nextLine();

if(P1.contains(" ")){
 P1=P1.substring(P1.indexOf(" "),P1.length());
}

if(P2.contains(" ")){
P2=P2.substring(P2.indexOf(" "),P2.length());}

if (P1.equals(P2)==true){
System.out.println("YES");}
else
{System.out.println("NO");}

}}
