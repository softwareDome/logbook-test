package com.exxeta.logbooktest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyResponse {
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String name;
}
