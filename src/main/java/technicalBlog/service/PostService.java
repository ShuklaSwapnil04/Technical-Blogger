package technicalBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import technicalBlog.model.Post;
import technicalBlog.repository.PostRepository;

import java.util.List;

public class PostService {
    @Autowired
    private PostRepository repository;
    public List<Post> getAllPosts()
    {
        return repository.getAllPosts();
    }
    public Post getOnePost()
    {
        return repository.getLatestPost();
    }
}

