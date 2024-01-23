package com.rickmoorty.model.episodes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ListOfEpisodeResponse(
        List<EpisodeResponse> results
) {

}
