package com.company.engage.Repositories;

import com.company.engage.Models.Engagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EngagementRepository extends JpaRepository<Engagement, String> {
}
