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
public class CorporateEvents {
    private long id;
    private String eventName;
    private String organizationName;
    private long numberOfAttendees;
    private String date;
    private String venue;
    private long budget;
}
