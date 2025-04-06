package fr.epsi.b3devc1.msprapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private Integer confirmed;
    private Integer deaths;
    private Integer recovered;
    private Integer active;
    private Integer newCases;
    private Integer newDeaths;
    private Integer newRecovered;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @ManyToOne
    @JoinColumn(name = "disease_id")
    private Disease disease;
}
