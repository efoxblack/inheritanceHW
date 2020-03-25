package person;

public class Person {
    private String name;
    private int age;
    private String favSport;
    private String occupation;
    private long salary;

    public Person () {

    }

    public Person (String name, int age, String favSport, String occupation, long salary) {
        this.name = name;
        this.age = age;
        this.favSport = favSport;
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavSport() {
        return favSport;
    }

    public void setFavSport(String favSport) {
        this.favSport = favSport;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String printInfo () {
        return "My name is " + this.name + " and I am " + this.age + " years old." + "\n" +
                "My favorite sport is " + this.favSport + " and by this time next year my " + "\n" +
                "occupation will be " + this.occupation + " meaning I could be making up to $" + "\n" +
                this.salary + " yearly!";
    }

    public long yearlyBonus (long bonus) {
        return salary + bonus;
    }
}
