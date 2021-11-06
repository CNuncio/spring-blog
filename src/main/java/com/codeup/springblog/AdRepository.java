package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.list;

public interface AdRepository extends JpaRepository<Ad, Long> {
}
