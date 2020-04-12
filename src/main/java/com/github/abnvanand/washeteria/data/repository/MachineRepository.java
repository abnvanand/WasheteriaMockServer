package com.github.abnvanand.washeteria.data.repository;

import com.github.abnvanand.washeteria.data.entity.Machine;
import org.springframework.data.repository.CrudRepository;

public interface MachineRepository
        extends CrudRepository<Machine, Long> {
    Iterable<Machine> findMachinesByLocationId(long locationId);
}
