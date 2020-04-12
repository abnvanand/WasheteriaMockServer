package com.github.abnvanand.washeteria.service;

import com.github.abnvanand.washeteria.data.entity.Event;
import com.github.abnvanand.washeteria.data.entity.Location;
import com.github.abnvanand.washeteria.data.entity.Machine;
import com.github.abnvanand.washeteria.data.entity.User;
import com.github.abnvanand.washeteria.data.repository.EventRepository;
import com.github.abnvanand.washeteria.data.repository.LocationRepository;
import com.github.abnvanand.washeteria.data.repository.MachineRepository;
import com.github.abnvanand.washeteria.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WasheteriaService {
    private final UserRepository userRepository;
    private final LocationRepository locationRepository;
    private final MachineRepository machineRepository;
    private final EventRepository eventRepository;

    @Autowired
    public WasheteriaService(UserRepository userRepository, LocationRepository locationRepository, MachineRepository machineRepository, EventRepository eventRepository) {
        this.userRepository = userRepository;
        this.locationRepository = locationRepository;
        this.machineRepository = machineRepository;
        this.eventRepository = eventRepository;
    }


    public User doLogin(String username, String password) {
        Optional<User> optionalUser = userRepository.findById(username);
        if (optionalUser.isEmpty()) {
            return null;
        }

        return optionalUser.get();
    }

    public List<Location> getAllLocations() {
        Iterable<Location> all = locationRepository.findAll();

        List<Location> locations = new ArrayList<>();
        all.forEach(locations::add);

        return locations;
    }

    public List<Machine> getAllMachines() {
        Iterable<Machine> all = machineRepository.findAll();
        List<Machine> machines = new ArrayList<>();
        all.forEach(machines::add);
        return machines;
    }

    public List<Machine> getMachinesByLocationId(long locationid) {
        Iterable<Machine> machinesByLocationId = machineRepository.findMachinesByLocationId(locationid);
        List<Machine> machines = new ArrayList<>();
        machinesByLocationId.forEach(machines::add);
        return machines;
    }

    public List<Event> getAllEvents() {
        Iterable<Event> all = eventRepository.findAll();
        List<Event> events = new ArrayList<>();
        all.forEach(events::add);

        return events;
    }

    public List<Event> getEventsForMachine(long machineId) {
        Iterable<Event> all = eventRepository.getEventsByMachineId(machineId);
        List<Event> events = new ArrayList<>();
        all.forEach(events::add);
        return events;
    }

    public List<Event> getCancelledEvents() {
        Iterable<Event> all = eventRepository.findAllByCancelledIsTrue(Pageable.unpaged());
        List<Event> events = new ArrayList<>();
        all.forEach(events::add);
        return events;
    }
}
