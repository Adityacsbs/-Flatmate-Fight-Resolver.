package com.project.Flatmate.Fight.Resolver.controller;


import com.project.Flatmate.Fight.Resolver.model.Complaint;
import com.project.Flatmate.Fight.Resolver.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping("/file")
    public Complaint fileComplaint(@RequestBody Complaint complaint) {
        return complaintService.fileComplaint(complaint);
    }

    @PostMapping("/{id}/upvote")
    public Complaint upvoteComplaint(@PathVariable Long id) {
        return complaintService.upvoteComplaint(id);
    }

    @PostMapping("/{id}/downvote")
    public Complaint downvoteComplaint(@PathVariable Long id) {
        return complaintService.downvoteComplaint(id);
    }

    @GetMapping("/trending")
    public List<Complaint> getTrendingComplaints() {
        return complaintService.getTrendingComplaints();
    }
}

