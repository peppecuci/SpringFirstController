package com.example.springdemo.controller;

import com.example.springdemo.services.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/player")
public class PlayerController {

    private final PlayerService playerService;

    //const
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(path = "/all" /*all stands for getAll*/, method = RequestMethod.GET)
    public ModelAndView getAllPlayers() {

        ModelAndView mv = new ModelAndView("player/all");

        mv.addObject("players", this.playerService.getAll());

        return mv;
    }

    @RequestMapping(path = "/one/{id}")
    public ModelAndView getOne(@PathVariable Long id) {

        ModelAndView mv = new ModelAndView("player/one");

        mv.addObject("p", this.playerService.getById(id));

        return mv;
    }

}
