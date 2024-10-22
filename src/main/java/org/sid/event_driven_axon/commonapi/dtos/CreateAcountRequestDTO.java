package org.sid.event_driven_axon.commonapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CreateAcountRequestDTO {
    private String currency;
    private double initialBalance;
}
