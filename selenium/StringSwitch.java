package selenium;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Custom input string
        String gender = "one";
 
        // Switch statement over above string
        switch (gender) {
 
        // Case 1
        case "one":
 
            // Print statement corresponding case
            System.out.println("one");
            System.out.println("one1");
 
            // break keyword terminates the
            // code execution here itself
            break;
 
        // Case 2
        case "two":
 
            // Print statement corresponding case
            System.out.println("two");
            break;
 
        // Case 3
        case "three":
 
            // Print statement corresponding case
            System.out.println("three");
            break;
 
        // Case 4
        // Default case
        default:
 
            // Print statement corresponding case
            System.out.println("no match");
        }
    }
	}


