package com.rickmoorty.model.location;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ListOfLocationResponse(
        List<LocationResponse> results
) {
}
