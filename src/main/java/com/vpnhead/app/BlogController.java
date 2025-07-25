package com.vpnhead.app;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "*")
public class BlogController {
    private final PostRepository repo;

    public BlogController(PostRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }
}
