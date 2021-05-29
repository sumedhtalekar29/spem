package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.PointsTable;

@Repository
public interface PointsTableRepository extends JpaRepository<PointsTable, Long>{

}
