package fr.epsi.b3devc1.msprapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private Integer totalCases;
    private Integer newCases;
    private Integer totalDeaths;
    private Integer newDeaths;
    private Integer totalRecovered;
    private Integer newRecovered;
    private Integer activeCases;
    private Integer seriousCritical;
    private Long totalTests;
    private Integer testsPerMillion;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "disease_id")
    private Disease disease;
}
