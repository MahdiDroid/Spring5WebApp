package com.mehdi.Spring5WebApp.Repositories;

import com.mehdi.Spring5WebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
