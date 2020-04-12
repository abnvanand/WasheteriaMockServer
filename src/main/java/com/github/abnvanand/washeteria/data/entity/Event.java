package com.github.abnvanand.washeteria.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "starts_at")
    private Timestamp startsAt;
    @Column(name = "ends_at")
    private Timestamp endsAt;
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "cancelled")
    private boolean cancelled;

    @Column(name = "machine_id")
    private long machineId;

    @Column(name = "creator")
    private String creator;


//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "machine_id")
//    private Machine machine;

//    @ManyToOne
//    private User user;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Timestamp startsAt) {
        this.startsAt = startsAt;
    }

    public Timestamp getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Timestamp endsAt) {
        this.endsAt = endsAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public long getMachineId() {
        return machineId;
    }

    public void setMachineId(long machineId) {
        this.machineId = machineId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String createdBy) {
        this.creator = createdBy;
    }
}
