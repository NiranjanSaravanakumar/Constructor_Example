package Pack1;
import java.util.Scanner;
class Data{
	String name;
	String pan;
	long aadhar;
	int mobileno;
	String email;
	Data[]d;
	public Data(String name, String pan, long aadhar, int mobileno, String email) {
		super();
		this.name = name;
		this.pan = pan;
		this.aadhar = aadhar;
		this.mobileno = mobileno;
		this.email = email;
		
	}
	public Data() {
		super();
	}

    int get_data(int no) {
        d = new Data[no];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < no; i++) {
            System.out.println("Enter name " + (i + 1));
            String name = sc.next();
            System.out.println("Enter pan " + (i + 1));
            String pan = sc.next();
            System.out.println("Enter Aadhar " + (i + 1));
            long aadhar = sc.nextLong();
            System.out.println("Enter Mobile no " + (i + 1));
            int mobileno = sc.nextInt();
            System.out.println("Enter E mail ID " + (i + 1));
            String email = sc.next();
            d[i] = new Data(name, pan, aadhar, mobileno, email);
        }
        return 1; 
    }

    void print_data(int no) {
        for (int i = 0; i < no; i++) {
            System.out.println("Name = " + d[i].name);
            System.out.println("Pan = " + d[i].pan);
            System.out.println("Aadhar = " + d[i].aadhar);
            System.out.println("Mobile no = " + d[i].mobileno);
            System.out.println("E Mail ID = " + d[i].email);
        }
    }
}

public class Student {
	 public static void main(String[] args) {
	        System.out.println("Enter No of Students");
	        Scanner sc = new Scanner(System.in);
	        int no = sc.nextInt();
	        Data d1 = new Data();
	        int c = d1.get_data(no);
	        d1.print_data(no);
	    }

}
