package org.souravsinha4.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="BookingReview")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    @Column(columnDefinition = "DOUBLE PRECISION")
    private Double rating;

}
