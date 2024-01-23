package com.rickmoorty.model.character;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Builder;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record CharacterResponse(String id,
                                String name,
                                String status,
                                String species,
                                String gender,
                                String image,

                                OriginResponse origin,
                                LocationCharResponse location,
                                List<String> episode) {
}
