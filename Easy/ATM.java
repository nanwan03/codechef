import java.text.DecimalFormat;
 
public class Main
{
	public static void main(String[] args) throws java.lang.Exception
		{
		java.io.BufferedReader r = new java.io.BufferedReader
				(new java.io.InputStreamReader (System.in));
 
 
			String input = r.readLine();
			String[] data = input.split(" ");
			int a = Integer.parseInt(data[0]);
			float b = Float.parseFloat(data[1]);
			DecimalFormat form = new DecimalFormat("0.00");
			float withdraw = a + .50f;
 
			if( (a%5 != 0) || b < withdraw){
				System.out.println(form.format(b));
			} else {
				System.out.println(form.format(b - withdraw));
			}
 
 
 
 
		}
 
} 