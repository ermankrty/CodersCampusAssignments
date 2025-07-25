package com.vpnhead.app;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PostRepository {
    private final List<Post> posts = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Post> findAll() {
        return posts;
    }

    public Post save(Post post) {
        post.setId(counter.incrementAndGet());
        posts.add(post);
        return post;
    }
}
