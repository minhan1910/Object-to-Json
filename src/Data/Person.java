package Data;

public class Person {
    private final String name;
    private final boolean employed;
    private final int age;
    private final float salary;
    private final Address address;
    private final Company job;

    private final int phones[];

    private final Movie[] movies;

    public Person(String name, boolean employed, int age, float salary, Address address, Company job, int[] phones,
            Movie[] movies) {
        this.name = name;
        this.employed = employed;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.job = job;
        this.phones = phones;
        this.movies = movies;
    }
}
