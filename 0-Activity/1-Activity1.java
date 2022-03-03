import java.util.*;

class S{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String stringF=sc.nextLine();

String stringS=sc.nextLine();

String StringF1=stringF.substring(0,1);
String StringF2=stringF.substring(1,stringF.length());

StringF1=StringF1.toUpperCase();
StringF2=StringF2.toLowerCase();

 stringF=StringF1+StringF2;

 stringS=stringS.toUpperCase();

System.out.println(stringF+" "+stringS);

}}