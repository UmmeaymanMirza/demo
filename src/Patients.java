import java.util.Comparator;
import java.util.Objects;

public class Patients implements Comparable<Patients>{

    private String lastName;
    private String firstName;
    private String ssn;

    public Patients(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public int compareTo(Patients o) {
        return this.lastName.compareTo(o.lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patients patients = (Patients) o;
        return ssn.equals(patients.ssn);
    }

    @Override
    public int hashCode() {
        return ssn.hashCode();
    }

    public static Comparator<Patients> lastNameOperator = Comparator.comparing(Patients::getLastName);
    @Override
    public String toString() {
        return "Patients{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ssn=" + ssn +
                '}';
    }

    public static void main(String[] args) {
        Patients p1 = new Patients("John", "Doe", "123456789");
        Patients p2 = new Patients("Jane", "Doe", "987654321");
        Patients p3 = new Patients("Alice", "Smith", "123456789");

        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.equals(p3)); // true

        System.out.println(p1.hashCode()); // Same as p3
        System.out.println(p2.hashCode());

        System.out.println(Patients.lastNameOperator.compare(p1, p3)); // Doe comes before Doe
    }
}
