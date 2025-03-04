package ru.checkdev.auth.repository;

import org.springframework.data.repository.CrudRepository;
import ru.checkdev.auth.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
