package factory;

import com.phone.Android;
import com.phone.Windows;
import com.phone.os;
import com.phone.systemfactory;


public class factorymain 
{
 public static void main(String a[])
 {
	 systemfactory sf=new systemfactory();
	// os obj=new Android();
	// os obj=new Windows();
	// os obj=sf.getIntance("open");
	// os obj=sf.getIntance("closed");
	 os obj=sf.getIntance("colsee");
	 
	 
			 
	 obj.spec();
	 
	 
 }
}
