import java.util.Scanner;

public class nestedswitch {
public static void main(String arg[])
{
	//char branch='E';
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a year");
			int collegeyear=s.nextInt();
			switch(collegeyear)
			{
				case 1:
					System.out.println("english,maths,science");
					break;
				case  2:
					System.out.println("Enetr a branch");
					char branch=s.next().charAt(0);
					switch(branch)
					{
						case 'E':
							System.out.println("Micro Proccessor,logic switching,macros");
							break;
						case 'C':
							System.out.println("c,data structures,cobol");
							break;
						case 'M':
							System.out.println("MOS,thermo dynamics,ms");
							break;
					default:
						System.out.println("Not in branch");
						break;
					}
					break;
				case 3:
					System.out.println("Enetr a branch");
					char br=s.next().charAt(0);
					switch(br)
					{
					case'E':
						System.out.println("mu p,logic switching,macros");
						break;
					case 'C':
						System.out.println("java,system analysis");
						break;
					case 'M':
						System.out.println("MOS,advanced manufacturing,ms");
						break;
				default:
					System.out.println("Not in branch");
					break;
						
					}
				}
					
			}
	}

