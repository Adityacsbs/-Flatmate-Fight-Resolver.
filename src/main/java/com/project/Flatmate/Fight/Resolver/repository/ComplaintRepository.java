package com.project.Flatmate.Fight.Resolver.repository;


import  com.project.Flatmate.Fight.Resolver.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByDownvotesGreaterThanAndUpvotesLessThanAndTimestampBeforeAndArchivedFalse(
            int downvotes, int upvotes, LocalDateTime timestamp);
}

