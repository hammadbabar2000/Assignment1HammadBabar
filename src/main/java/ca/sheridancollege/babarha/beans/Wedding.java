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
public class Wedding {

    private long id;
    private String couplesName;
    private String weddingDate;
    private String venue;
    private long guestCount;
    private String theme;
    private String cateringPreferences;
}
