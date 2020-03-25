package person;

public class Main {
    public static void main(String[] args) {
        // 3 Instances of the person class
        Person p1 = new Person("Mike Jones", 22, "FootBall", "a Professional Football Player", 30000000);
        Person p2 = new Person("Johnny Test", 15, "E-Sports", "a Couch Potato", 24);
        Person p3 = new Person("Kanye West", 42, "Basketball", "a Producer/Musician", 150000000);

        // Loop through the three instances, printing out their info
        Person[] people = {p1, p2, p3};
        for (Person p : people) {
            System.out.println(p.printInfo());
        }

        // Change p2's salary and then print it
        p2.setSalary(45);
        System.out.println("Johnny Test's new salary is $" + p2.getSalary());

        // Print out p1's bonus and salary total
        System.out.println("Mike Jones' salary after his yearly bonus is $" + p1.yearlyBonus(1000000));
    }
}
