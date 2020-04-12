package com.github.abnvanand.washeteria.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "machines")
public class Machine {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location_id")
    private long locationId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private MachineStatus status;

//    @ManyToOne
//    private Location location;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public MachineStatus getStatus() {
        return status;
    }

    public void setStatus(MachineStatus status) {
        this.status = status;
    }
}
