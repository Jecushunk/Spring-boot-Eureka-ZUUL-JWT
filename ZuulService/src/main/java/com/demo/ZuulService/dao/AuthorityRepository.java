package com.demo.ZuulService.dao;

import com.demo.ZuulService.entity.Authority;
import com.demo.ZuulService.entity.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority findByName(AuthorityName name);
}