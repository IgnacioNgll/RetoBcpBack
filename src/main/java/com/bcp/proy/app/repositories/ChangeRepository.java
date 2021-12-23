package com.bcp.proy.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.proy.app.domain.Change;

import java.util.List;

@Repository
public interface ChangeRepository extends JpaRepository<Change, Long> {

    List<Change> findByOriginAndDestination(String origin, String destination);

}
