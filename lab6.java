import java.util.*;
import java.io.*;
import java.net.*;
public class lab6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dataword");
		String data=sc.nextLine();
		System.out.println("enter the generator code");
		String gen=sc.nextLine();
		String code=data;
		while(code.length()<(data.length())+(gen.length()-1)){
		code=code+"0";
		}
		code=data+div(code,gen);
		System.out.println("message transmitted"+code);
		String rem=div(code,gen);
		if(Integer.parseInt(rem)==0)
			System.out.println("no error in the data");
		else
			System.out.println("error in the data");
		System.out.println("enter the position to alter the message");
		int pos=sc.nextInt();
		if(code.charAt(pos)=='0')
			code=code.substring(0,pos)+"1"+code.substring(pos+1);
		else
			code=code.substring(0,pos)+"0"+code.substring(pos+1);
		System.out.println("altered data "+code);
		if(Integer.parseInt(div(code,gen))==0)
			System.out.print("no error");
		else	
			System.out.println("error");
			}
		 static String div(String num1,String num2)
		{
			int pointer=num2.length();
			String result=num1.substring(0,pointer);
			String rem="";
			for(int i=0;i<pointer;i++){
				if(result.charAt(i)==num2.charAt(i))
					rem=rem+"0";
				else
					rem=rem+"1";
			}
			while(pointer<num1.length()) {
				if(rem.charAt(0)=='0')
					rem=rem.substring(1,rem.length());
					rem=rem+String.valueOf(num1.charAt(pointer));
					pointer++;
			
				result=rem;
				rem="";
				if(result.charAt(0)!='0'){
					for(int i=0;i<num2.length();i++){
						if(result.charAt(i)==num2.charAt(i))
							rem=rem+"0";
						else
							rem=rem+"1";
					}
				}
				else
					rem=result;
			}
						
						return rem.substring(1,rem.length());
		}
}
												
