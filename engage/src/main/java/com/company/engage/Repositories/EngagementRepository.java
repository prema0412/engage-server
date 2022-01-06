package com.company.engage.Repositories;

import com.company.engage.Models.Engagement;
import com.company.engage.Models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.hql.internal.antlr.HqlTokenTypes.FROM;
import static org.hibernate.loader.Loader.SELECT;

@Repository

public interface EngagementRepository extends JpaRepository<Engagement, String> {

    @Query("SELECT DISTINCT category FROM Engagement")
    List<String> findAllCategories();

    @Query("SELECT DISTINCT location FROM Engagement")
    List<String> findAllLocations();

    @Query("SELECT DISTINCT workingPreference FROM Engagement")
    List<String> findAllWorkOptions();


    @Query("SELECT e FROM Engagement e WHERE e.status = 'OPEN'")
    List<Engagement> findOpenEngagements();

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Engagement SET status = :newStatus WHERE id = :id")

    void updateEngagementStatus(@Param("id") int id, @Param("newStatus") Status newStatus);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Engagement SET status = REPORTED WHERE id = :id")

    void reportEngagement(@Param("id") int id);
}


