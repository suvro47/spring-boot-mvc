package com.dsi.spring.services;

import java.util.List;

import com.dsi.spring.model.Actor;

import org.springframework.stereotype.Service;

@Service
public interface ActorService {
    void createActor(Actor actor);

    List<Actor> getActors();

}
