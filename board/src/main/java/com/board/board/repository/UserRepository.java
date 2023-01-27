package com.board.board.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.board.entity.SiteUser;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}
