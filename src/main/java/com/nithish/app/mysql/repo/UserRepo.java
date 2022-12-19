package com.nithish.app.mysql.repo;

import com.nithish.app.mysql.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
