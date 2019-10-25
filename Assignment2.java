import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many student's data do you want to enter?");
        int n = input.nextInt();
        Student[] arr = new Student[n];
        String first, last, psID, year, email, address, city, state, zip;
        Scanner inp = new Scanner(System.in);


        for (int j = 0; j < n; j++) {
            arr[j] = new Student();
            do {
                System.out.println("Enter student first name and press enter.");
                first = inp.nextLine();
            } while (!first.matches("[A-z]+"));
            do {
                System.out.println("Enter student last name and press enter.");
                last = inp.nextLine();
            } while (!last.matches("[A-z]+"));
            do {
                System.out.println("Enter student peoplesoft ID and press enter.");
                psID = inp.nextLine();
            } while (!psID.matches("[0-9]{1,7}+"));
            do {
                System.out.println("Enter student class standing and press enter.");
                year = inp.nextLine();
            } while (!year.matches("(freshman|sophmore|junior|senior)$"));
            do {
                System.out.println("Enter student email and press enter.");
                email = inp.nextLine();
            } while (!email.matches("[A-z1-9]+@[A-z1-9]+.(com|edu|org|gov)$"));
            do {
                System.out.println("Enter student address and press enter.");
                address = inp.nextLine();
            } while (!address.matches("^(\\d+) ?([A-z](?= ))? (.*?) ([^ ]+?) ?((?<= )APT)? ?((?<= )\\d*)?$"));
            do {
                System.out.println("Enter student city and press enter.");
                city = inp.nextLine();
            } while (!city.matches("[A-z]+"));
            do {
                System.out.println("Enter student state and press enter.");
                state = inp.nextLine();
            } while (!state.matches("(AK|AL|AR|AZ|CA|CO|CT|DC|DE|FL|GA|HI|IA|ID|IL|IN|KS|" +
                    "KY|LA|MA|MD|ME|MI|MN|MO|MS|MT|NC|ND|NE|NH|NJ|NM|NV|NY|OH|OK|OR|PA|" +
                    "RI|SC|SD|TN|TX|UT|VA|VT|WA|WI|WV|WY|)"));
            do {
                System.out.println("Enter student zip code and press enter.");
                zip = inp.nextLine();
            } while (!zip.matches("[0-9]{9}+"));
            arr[j].getInfo(first, last, psID, year, email, address, city, state, zip);


        }
        for (int j = 0; j < n; j++) {
            arr[j].displayInfo();
            System.out.println("Numbers of Students: " + Student.count());
        }

    }
}









