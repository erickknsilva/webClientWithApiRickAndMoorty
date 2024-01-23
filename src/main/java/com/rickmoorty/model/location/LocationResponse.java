package com.rickmoorty.model.location;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record LocationResponse(

        String id,
        String name,
        String type,
        String dimension,

        List<String> residents,
        String url
) {
}
