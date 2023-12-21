package com.example.interfacepractice.persistence;

import com.example.interfacepractice.persistence.entity.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceEntity, UUID> {
    List<ResourceEntity> findAllBySomeTextField(String someTextField);
}
