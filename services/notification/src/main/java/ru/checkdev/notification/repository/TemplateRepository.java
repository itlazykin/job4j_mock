package ru.checkdev.notification.repository;

import org.springframework.data.repository.CrudRepository;
import ru.checkdev.notification.domain.Template;

public interface TemplateRepository extends CrudRepository<Template, Integer> {
    Template findByType(String key);
}
