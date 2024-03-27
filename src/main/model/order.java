package lt.eif.viko.mnark.travelagency.model;

import javax.xml.bind.annotation.*;
import javax.persistence.*;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"id", "orderDate", "travelers", "trips"})
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "AgencyOrder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String orderDate;

    @XmlElementWrapper(name="travelers")
    @XmlElement(name="traveler")
    @ManyToMany(targetEntity = Traveler.class, cascade = CascadeType.ALL)
    private List<Traveler> travelers;

    @XmlElementWrapper(name="trips")
    @XmlElement(name="trip")
    @OneToMany(targetEntity = Trip.class, cascade = CascadeType.ALL)
    private List<Trip> trips;

    public Order() {}

    public Order(String orderDate, List<Traveler> travelers, List<Trip> trips) {
        this.orderDate = orderDate;
        this.travelers = travelers;
        this.trips = trips;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getOrderDate() { return orderDate; }

    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public List<Traveler> getTravelers() { return travelers; }

    public void setTravelers(List<Traveler> travelers) { this.travelers = travelers; }

    public List<Trip> getTrips() { return trips; }

    public void setTrips(List<Trip> trips) { this.trips = trips; }

    @Override
    public String toString() {
        return String.format("Order:\n\t Date = %s\n\tTravelers: %s\n\tTrips: %s",
                this.orderDate,
                this.travelers,
                this.trips);
    }
}

