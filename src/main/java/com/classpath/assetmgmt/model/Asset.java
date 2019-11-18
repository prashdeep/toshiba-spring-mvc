package com.classpath.assetmgmt.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@Builder
@Entity
@Table(name = "assets")
public class Asset {

    public Asset(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asset_id")
    private Long id;

    @NotBlank(message = "asset name cannot be blank")
    @Column(name = "asset_name")
    private String name;

    @NotNull(message = "asset price cannot be blank")
    @Range(min = 45000, max = 200000, message = "asset price should be between 45K and 200K")
    private double price;
}