package lt.eif.viko.mnark.travelagency.model;

import javax.persistence.*;

@Entity
@Table(name="traveler")
public class Traveler {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String firstName, lastName;

    public Traveler() {}

    public Traveler(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public String toString() {
        return String.format("\tName = %s\n\t\tLast Name = %s\n\t\t", firstName, lastName);
    }
}

