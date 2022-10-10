import java.util.Scanner;
public class PhoneNumberFormat
{
public static void main(String[] args)
{
Scanner keyboard=new Scanner(System.in);
String phoneNumber="";
String formattedPhoneNumber="";
while(true)
{
System.out.println("Enter phone number :xxxxxxxxxx");
phoneNumber=keyboard.nextLine();
if(phoneNumber.equalsIgnoreCase("999"))
System.exit(0);
if(phoneNumber.length()<10)
System.out.println("Invalid phone number .");
else
{
formattedPhoneNumber+="("+phoneNumber.substring(0, 3)+")";
formattedPhoneNumber+=phoneNumber.substring(3, 6);
formattedPhoneNumber+="-";
formattedPhoneNumber+=
phoneNumber.substring(6, phoneNumber.length());
System.out.println(formattedPhoneNumber);
}
}
}
}