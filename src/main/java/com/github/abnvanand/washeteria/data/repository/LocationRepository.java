package com.github.abnvanand.washeteria.data.repository;

import com.github.abnvanand.washeteria.data.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository
        extends CrudRepository<Location, Long> {

}
