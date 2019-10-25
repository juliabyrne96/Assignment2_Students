public class Student {
    String first;
    String last;
    String psID;
    String year;
    String email;
    String address;
    String city;
    String state;
    String zip;
    static int count = 0;

    public void getInfo(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        first = a;
        last = b;
        psID = c;
        year = d;
        email = e;
        address = f;
        city = g;
        state = h;
        zip = i;

    }



    public void displayInfo() {
        System.out.println("\nStudent Details, Department of ILT\n");
        System.out.println("First Name: " + first);
        System.out.println("Last Name: " + last);
        System.out.println("PeopleSoft ID: " + psID);
        System.out.println("Class Standing: " + year);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address + "\t" + city + "," + state + "\t" + zip + "\n");

    }
    public static int count(){
        count+=1;
        return count;
    }
}
