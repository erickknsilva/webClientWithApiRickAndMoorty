package com.rickmoorty.client;

import com.rickmoorty.model.character.CharacterResponse;
import com.rickmoorty.model.episodes.ListOfEpisodeResponse;
import com.rickmoorty.model.location.ListOfLocationResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class RickAndMortyClient {

    private final WebClient webClient;

    public RickAndMortyClient(WebClient.Builder builder) {
        webClient = builder
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }


    public Mono<CharacterResponse> findByCharacter(String id) {

        return webClient.get().uri("/character/" + id)
                .accept(APPLICATION_JSON)
                .retrieve().bodyToMono(CharacterResponse.class);
    }

    public Flux<ListOfEpisodeResponse> findAllEpisodes() {

        return webClient.get().uri("/episode")
                .accept(APPLICATION_JSON)
                .retrieve().bodyToFlux(ListOfEpisodeResponse.class);
    }


    public Flux<ListOfLocationResponse> allLocations() {

        return webClient.get().uri("/location")
                .accept(APPLICATION_JSON)
                .retrieve().bodyToFlux(ListOfLocationResponse.class);
    }


}
