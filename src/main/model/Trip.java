package lt.eif.viko.mnark.travelagency.model;

import javax.persistence.*;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String organizationName, name, location, tripDuration;
    private int cost;

    public Trip() {}

    public Trip(String organizationName, String name, String location, String tripDuration, int cost) {
        this.organizationName = organizationName;
        this.name = name;
        this.location = location;
        this.tripDuration = tripDuration;
        this.cost = cost;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getOrganizationName() { return organizationName; }

    public void setOrganizationName(String organizationName) { this.organizationName = organizationName; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getTripDuration() { return tripDuration; }

    public void setTripDuration(String tripDuration) { this.tripDuration = tripDuration; }

    public int getCost() { return cost; }

    public void setCost(int cost) { this.cost = cost; }

    @Override
    public String toString() {
        return String.format("\tTrip:\n\t\t\t\tOrganization Name = %s\n\t\t\t\tName = %s\n\t\t\t\tLocation = %s\n\t\t\t\tTrip Duration = %s\n\t\t\t\tCost = %s\n\t\t\t\t",
                organizationName, name, location, tripDuration, cost);
    }
}

