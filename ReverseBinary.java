import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseBinary{
    
    private static int biggestNumber = 1000000000;
	
	public static void main(String[] args) throws IOException{
			try{
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			    String readLine=stdin.readLine();
				int numb = Integer.parseInt(readLine);
					if(numb>0 && numb<=biggestNumber){
						String outputString = new StringBuffer(Integer.toBinaryString(numb)).reverse().toString();
						numb = Integer.parseInt(outputString, 2);
						System.out.println(numb);
					}else{
						System.out.println("Your number is out of range");
					}
			}catch(NumberFormatException e){
				System.out.println("you must choose a number(integer) as input");
			}
			catch(java.io.IOException e){
                System.out.println("Java IO Exception thrown");
			}
		}
	}