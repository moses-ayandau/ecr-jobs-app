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
        jobs.add(new Job("Frontend Developer", "Design and develop user interfaces", List.of("JavaScript", "React", "CSS")));
        jobs.add(new Job("Backend Developer", "Build and maintain server-side applications", List.of("Node.js", "Express", "PostgreSQL")));
        jobs.add(new Job("Cloud Engineer", "Deploy and manage cloud-based solutions", List.of("AWS", "Terraform", "Kubernetes")));
        jobs.add(new Job("Cybersecurity Analyst", "Protect systems from cyber threats", List.of("Penetration Testing", "Network Security", "SIEM")));
        jobs.add(new Job("AI Engineer", "Develop AI-driven applications and models", List.of("TensorFlow", "PyTorch", "NLP")));
        jobs.add(new Job("Mobile Developer", "Create mobile applications for Android and iOS", List.of("Flutter", "Swift", "Kotlin")));
        jobs.add(new Job("Product Manager", "Oversee product development and strategy", List.of("Agile", "Scrum", "Market Research")));
        jobs.add(new Job("QA Engineer", "Ensure software quality and testing", List.of("Selenium", "JUnit", "Test Automation")));
        jobs.add(new Job("UI/UX Designer", "Create intuitive and visually appealing user experiences", List.of("Figma", "Adobe XD", "User Research")));
        jobs.add(new Job("Blockchain Developer", "Develop decentralized applications and smart contracts", List.of("Ethereum", "Solidity", "Web3.js")));

        model.addAttribute("jobs", jobs);

        return "jobs";
    }
}