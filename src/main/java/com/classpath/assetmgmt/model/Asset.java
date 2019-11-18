package com.classpath.assetmgmt.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@Builder
public class Asset {

    public Asset(){}

    private Long id;

    @NotBlank(message = "asset name cannot be blank")
    private String name;

    @NotNull(message = "asset price cannot be blank")
    @Range(min = 45000, max = 200000, message = "asset price should be between 45K and 200K")
    private double price;
}