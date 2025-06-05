package com.Framework_architecture.framework_architecture.service;

import com.Framework_architecture.framework_architecture.models.Mentor;
import com.Framework_architecture.framework_architecture.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorService {
    @Autowired
    private MentorRepository mentorRepository;
    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }
}
