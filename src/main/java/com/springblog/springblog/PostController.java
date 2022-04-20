package com.springblog.springblog;


import com.springblog.springblog.models.Posts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController
{
    @GetMapping("/")
    public String hello(@PathVariable Model model)
    {
        Posts post1 = new Posts("My First Post", "This is where i will rant");
        model.addAttribute("post1", post1);
        return "/Posts/index";
    };

    @GetMapping("/posts")
    @ResponseBody
    public String posts()
    {
        return "This is the posts page!";
    };

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)

    public String postsById(@PathVariable String id, Model model)
    {
//        Posts post2 = new Posts("My Second Post", "This is where i will rant");
//        model.addAttribute("post2", post2);

        return  "/Posts/index";
    };

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String viewPostCreate()
    {


        return  "/Posts/index";
    };

//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String PostCreated()
//    {
//        return  " this is to create a new post";
//    }
};
