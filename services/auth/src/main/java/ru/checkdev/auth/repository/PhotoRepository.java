package ru.checkdev.auth.repository;

import org.springframework.data.repository.CrudRepository;
import ru.checkdev.auth.domain.Photo;

public interface PhotoRepository extends CrudRepository<Photo, Integer> {
}
