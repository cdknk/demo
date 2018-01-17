package com.example.demo;

import com.sun.imageio.plugins.gif.GIFImageReader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
