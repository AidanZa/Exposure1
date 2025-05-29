package Lab03;

public class Lab03 {
    public static void main(String[] args) {

        System.out.println("Lab03, 80 point Version\n");

        int millisceonds = 10000123;
        int hours = millisceonds / 3600;
        int minutes = millisceonds % 3600 / 60;
        int second = millisceonds % 60;
        int millisecond = hours / 1000;
        int minute = hours % 60;


        System.out.println("Seconds: \t" + second);
        System.out.println("Minutes: \t" + minutes);
        System.out.println("Hours: \t\t" + hours);
        System.out.println("Millisecond: \t" + millisecond);

    }

}