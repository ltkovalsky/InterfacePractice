package com.example.interfacepractice.persistence;

import com.example.interfacepractice.persistence.entity.ResourceOneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ResourceOneRepository extends JpaRepository<ResourceOneEntity, UUID> {
}
