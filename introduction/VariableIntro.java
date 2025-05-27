package introduction;

public class VariableIntro {
    public static void main(String[] args) {

        /*
         * to create a variable
         * datatype name = value
         */
        double salary = 10000.56;
        int bonus  = 250;

        /*
        * Casting a variable means changing its datatype
        *
        *
        */
        bonus = (int) salary;

        System.out.println(salary);
        System.out.println(bonus);

    }

}
