package ca.sheridancollege.babarha.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true)
@Builder
public class Workshops {
    private long id;
    private String workshopTitle;
    private String instructor;
    private String duration;
    private String date;
    private long numberOfAttendees;
    private String materialRequired;

}
