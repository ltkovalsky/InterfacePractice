package com.example.interfacepractice.persistence;

import com.example.interfacepractice.persistence.entity.ResourceTwoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ResourceTwoRepository extends JpaRepository<ResourceTwoEntity, UUID> {
}
