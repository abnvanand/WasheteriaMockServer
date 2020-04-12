package com.github.abnvanand.washeteria.data.repository;

import com.github.abnvanand.washeteria.data.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository
        extends PagingAndSortingRepository<Event, Long> {
    Iterable<Event> getEventsByMachineId(Long machineId);

    Iterable<Event> getEventsByCreator(String username);

    Page<Event> findAllByCancelledIsTrue(Pageable pageable);

    Page<Event> findAllByCancelledIsFalse(Pageable pageable);
}
