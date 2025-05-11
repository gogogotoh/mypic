package org.example.mypicdemo.controller;

import org.example.mypicdemo.entity.Post;
import org.example.mypicdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/events")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public List<Map<String, Object>> getEvents() {
        List<Post> posts = postRepository.findAll();
        List<Map<String, Object>> events = new ArrayList<>();

        for (Post post : posts) {
            Map<String, Object> event = new HashMap<>();
            event.put("title", post.getTitle());
            event.put("start", post.getDate().toString());
            event.put("imageUrl", post.getImageUrl());
            event.put("postId", post.getId());
            events.add(event);
        }

        return events;
    }
}