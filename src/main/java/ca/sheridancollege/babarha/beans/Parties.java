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
public class Parties {

    private long id;
    private String partyType;
    private String hostName;
    private String date;
    private String venue;
    private long numberOfGuests;
    private String entertainmentOptions;

}
