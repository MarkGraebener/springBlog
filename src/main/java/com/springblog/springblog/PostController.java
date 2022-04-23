package com.springblog.springblog;


import com.springblog.springblog.models.Posts;
import com.springblog.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController
{
private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }
//    @GetMapping("/")
//    public String hello( Model model)
//    {
//        Posts post1 = new Posts("My First Post", "This is where i will rant");
//        model.addAttribute("post1", post1);
//        return "/Posts/index";
//    };

    @GetMapping("/posts")

    public String posts(Model model)
    {
        model.addAttribute("posts",
                postDao.findAll());
        return "Posts/index";
    };

    @RequestMapping(path = "/Posts/{id}", method = RequestMethod.GET)

    public String postsById(@PathVariable String id, Model model)
    {
//        Posts post2 = new Posts("My Second Post", "This is where i will rant");
//        model.addAttribute("post2", post2);

        return  "/Posts/index";
    };

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    public String viewPostCreate(Model model)
    {
model.addAttribute("post", new Posts());

        return  "/Posts/createPosts";
    };

    @PostMapping("/posts/create")

    public String PostCreated(@ModelAttribute Posts post)
    {
        postDao.save(post);
        return  "Posts/index";
    }
};
