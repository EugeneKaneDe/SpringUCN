package net.kane.SpringUC.dao;

import org.springframework.context.annotation.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
