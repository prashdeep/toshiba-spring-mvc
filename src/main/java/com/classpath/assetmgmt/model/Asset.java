package com.classpath.assetmgmt.model;

import com.classpath.assetmgmt.constraint.EmailContraint;
import lombok.*;
import org.hibernate.validator.constraints.Range;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@Builder
@Entity
@Table(name = "assets")
@XmlRootElement(name = "asset")
public class Asset {

    public Asset(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asset_id")
    @XmlAttribute
    private Long id;

    @NotBlank(message = "asset name cannot be blank")
    @Column(name = "asset_name")
    @XmlElement
    private String name;

    @NotNull(message = "asset price cannot be blank")
    @Range(min = 45000, max = 200000, message = "asset price should be between 45K and 200K")
    @XmlElement
    private double price;

    @EmailContraint(message = "email is incorrect")
    @Column(name="support_email")
    private String supportEmail;
}