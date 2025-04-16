package vaibhav;
import java.util.Scanner;
public class CurrencyConverter 
{
public static void main(String[] args)
{
System.out.println("1 Rupee");		
System.out.println("2 Dollar");
System.out.println("3 Euro");
 Scanner sc=new Scanner(System.in);
System.out.println("Choose the Currency..");
int choice=sc.nextInt();
System.out.println("Enter the amount=");
double amount=sc.nextDouble();
switch(choice)
{
case 1:
	Ruppe_to_other(amount);
	break;
case 2:
	Dollar_to_other(amount);
	break;	
case 3:
	Euro_to_other(amount);
	break;
}
	}
private static void Dollar_to_other(double amt)
{
	System.out.println("1 Dollar="+79.37+" Ruppe");
System.out.println();
System.out.println(amt+ "Dollar="+(amt*79.37)+" Ruppe");
System.out.println();
System.out.println("1 Dollar="+0.98+" Euro");
System.out.println();
System.out.println(amt+ "Dollar="+(amt*0.98)+" Euro");
System.out.println();	
}
private static void Ruppe_to_other(double amt)
{
	System.out.println("1 ruppe="+0.013+" Dollar");
	System.out.println();	
	System.out.println("amt Ruppe="+(amt+0.013)+ "Dollar");
	System.out.println();
	System.out.println("1 ruppe="+0.012+" Euro");
	System.out.println();
	System.out.println("amt Ruppe="+(amt*0.013)+ "Euro");
	System.out.println();
}
private static void Euro_to_other(double amt)
{
	System.out.println("1 Euro="+80.85+"Ruppe");
	System.out.println();	
	System.out.println("amt Euro="+(amt*80.85)+ "Ruppe");
	System.out.println();
	System.out.println("1 Euro="+1.02+"Dollar");
	System.out.println();
	System.out.println("amt Euro="+(amt*1.02)+ "Dollar");
	System.out.println();
}
}
A. Clone any public repository on GitHub
git clone https://github.com/username/repo-name.git


B. Create a public repository with a README.md file, modify it, and commit
Go to GitHub and create a new public repository. Make sure you check "Initialize this repository with a README".
=git clone https://github.com/your-username/your-repo-name.git
=cd your-repo-name
Edit the README.md file locally (use any text editor):
=nano README.md
(Add some purpose description, e.g. "This repo is created to demonstrate Git basics.")

Stage and commit the changes:
=git add README.md
=git commit -m "Update README with repository purpose"
C. Globally configure your username and email
=git config --global user.name "Your Name"
=git config --global user.email "your.email@example.com"
D. Pull the README.md file from the repository
=git pull origin main
(Replace main with master if that's your default branch)

E. Edit README.md, create index.html, add both to staging
Edit README.md:
=nano README.md
Create a new index.html file:
=nano index.html
(Add basic HTML content like <html><body><h1>Hello GitHub</h1></body></html>)
	
=git add README.md index.html
F. Push changes to the repository using the upstream flag
Commit your changes:

=git commit -m "Update README and add index.html"
Push with upstream:

=git push --set-upstream origin main


	}}
