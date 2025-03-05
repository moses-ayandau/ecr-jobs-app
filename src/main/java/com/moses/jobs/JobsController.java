package com.moses.jobs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class JobsController {

    @GetMapping
    public String getJobs(Model model) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Software Engineer", "Develop and maintain software applications", List.of("Java", "Spring Boot", "MongoDB")));
        jobs.add(new Job("Data Scientist", "Analyze and interpret complex data", List.of("Python", "Pandas", "Machine Learning")));
        jobs.add(new Job("DevOps Engineer", "Manage infrastructure and deployment pipelines", List.of("Docker", "Kubernetes", "CI/CD")));

        model.addAttribute("jobs", jobs);

        return "jobs";
    }
}