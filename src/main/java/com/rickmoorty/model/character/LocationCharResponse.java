package com.rickmoorty.model.character;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record LocationCharResponse(
        String name,
        String url
) {
}
