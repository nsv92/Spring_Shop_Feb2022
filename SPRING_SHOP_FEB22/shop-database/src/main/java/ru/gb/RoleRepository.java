package ru.gb;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.persist.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
