package com.project.Flatmate.Fight.Resolver.service;



import  com.project.Flatmate.Fight.Resolver.model.Complaint;
import com.project.Flatmate.Fight.Resolver.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    public Complaint fileComplaint(Complaint complaint) {
        complaint.setTimestamp(LocalDateTime.now());
        complaint.setUpvotes(0);
        complaint.setDownvotes(0);
        complaint.setArchived(false);
        return complaintRepository.save(complaint);
    }

    public Complaint upvoteComplaint(Long id) {
        Complaint complaint = complaintRepository.findById(id).orElseThrow(() -> new RuntimeException("Complaint not found"));
        complaint.setUpvotes(complaint.getUpvotes() + 1);
        return complaintRepository.save(complaint);
    }

    public Complaint downvoteComplaint(Long id) {
        Complaint complaint = complaintRepository.findById(id).orElseThrow(() -> new RuntimeException("Complaint not found"));
        complaint.setDownvotes(complaint.getDownvotes() + 1);
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getTrendingComplaints() {
        return complaintRepository.findByDownvotesGreaterThanAndUpvotesLessThanAndTimestampBeforeAndArchivedFalse(
                5, 3, LocalDateTime.now().minusDays(3));
    }

    @Scheduled(cron = "0 0 0 * * ?") // Runs every midnight
    public void archiveOldComplaints() {
        List<Complaint> complaintsToArchive = complaintRepository
                .findByDownvotesGreaterThanAndUpvotesLessThanAndTimestampBeforeAndArchivedFalse(5, 3, LocalDateTime.now().minusDays(3));
        for (Complaint complaint : complaintsToArchive) {
            complaint.setArchived(true);
            complaintRepository.save(complaint);
        }
    }
}
