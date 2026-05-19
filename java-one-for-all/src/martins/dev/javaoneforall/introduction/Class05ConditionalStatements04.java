package martins.dev.javaoneforall.introduction;

/**
 * I want to know how much I have to pay in the Netherlands 2020 based on my annual salary <br/>
 * 0 - 34712 - 9.70% <br/>
 * 34713 - 68507 - 37.35% <br/>
 * 68508 - > - 49.50% <br/>
 */

public class Class05ConditionalStatements04 {
    public static void main(String[] args) {
        double annualSalary = 70_000;
        double tax;
        if (annualSalary <= 34_712) {
            tax = 9.70 / 100;
        } else if (annualSalary <= 68_507) {
            tax = 37.35 / 100;
        } else {
            tax = 49.50 / 100;
        }

        double amountToBePaid = annualSalary * tax;
        System.out.println("amountToBePaid " + amountToBePaid);
        double netAnnualSalary = annualSalary - amountToBePaid;
        System.out.println("netAnnualSalary " + netAnnualSalary);
    }
}
