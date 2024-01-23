package com.rickmoorty.web;

import com.rickmoorty.client.RickAndMortyClient;
import com.rickmoorty.model.character.CharacterResponse;
import com.rickmoorty.model.episodes.ListOfEpisodeResponse;
import com.rickmoorty.model.location.ListOfLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
@AllArgsConstructor
public class RickAndMortyWeb {

    private RickAndMortyClient rickAndMortyClient;

    @GetMapping("/character/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<CharacterResponse> findById(@PathVariable String id) {
        return rickAndMortyClient.findByCharacter(id);
    }


    @GetMapping("/episodes")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfEpisodeResponse> findAllEpisodes() {
        return rickAndMortyClient.findAllEpisodes();
    }

    @GetMapping("/locations")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfLocationResponse> findAllLocations() {
        return rickAndMortyClient.allLocations();
    }

}
