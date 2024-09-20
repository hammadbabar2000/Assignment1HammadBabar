package ca.sheridancollege.babarha.controller;

import ca.sheridancollege.babarha.beans.CorporateEvents;
import ca.sheridancollege.babarha.beans.Parties;
import ca.sheridancollege.babarha.beans.Wedding;
import ca.sheridancollege.babarha.beans.Workshops;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    //Display the home page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/corporateEvents")
    public String corporateEvents() {
        return "corporateEvents";
    }

    @GetMapping("/workshops")
    public String workshops() {
        return "workshops";
    }

    @GetMapping("/weddings")
    public String weddings() {
        return "weddings";
    }

    @GetMapping("/parties")
    public String parties() {
        return "parties";
    }

    @GetMapping("/submitted")
    public String submitted() {
        return "submitted";
    }

//    @GetMapping("/style")
//    public String style() {
//        return "style";
//    }

    @PostMapping("/corporateEventsForm")
    public String corporateEventsForm(
            @RequestParam long id,
            @RequestParam String eventName,
            @RequestParam String organizationName,
            @RequestParam long numberOfAttendees,
            @RequestParam String date,
            @RequestParam String venue,
            @RequestParam long budget) {

        CorporateEvents corporateEvents = CorporateEvents.builder()
                .id(id)
                .eventName(eventName)
                .organizationName(organizationName)
                .numberOfAttendees(numberOfAttendees)
                .date(date)
                .venue(venue)
                .budget(budget)
                .build();

        System.out.println(corporateEvents.toString());

        return "submitted";
    }

    @PostMapping("/workshopsForm")
    public String workshopsForm(
            @RequestParam long id,
            @RequestParam String workshopTitle,
            @RequestParam String instructor,
            @RequestParam String duration,
            @RequestParam String date,
            @RequestParam long numberOfAttendees,
            @RequestParam String materialRequired){

        Workshops workshops = Workshops.builder()
                .id(id)
                .workshopTitle(workshopTitle)
                .instructor(instructor)
                .duration(duration)
                .date(date)
                .numberOfAttendees(numberOfAttendees)
                .materialRequired(materialRequired)
                .build();

        System.out.println(workshops.toString());
        return "submitted";
    }

    @PostMapping("/weddingsForm")
    public String weddingsForm(
            @RequestParam long id,
            @RequestParam String couplesName,
            @RequestParam String weddingDate,
            @RequestParam String venue,
            @RequestParam long guestCount,
            @RequestParam String theme,
            @RequestParam String cateringPreferences) {

        Wedding wedding = Wedding.builder()
                .id(id)
                .couplesName(couplesName)
                .weddingDate(weddingDate)
                .venue(venue)
                .guestCount(guestCount)
                .theme(theme)
                .cateringPreferences(cateringPreferences)
                .build();

        System.out.println(wedding.toString());

        return "submitted";
    }



    @PostMapping("/partiesForm")
    public String partiesForm(
            @RequestParam long id,
            @RequestParam String partyType,
            @RequestParam String hostName,
            @RequestParam String date,
            @RequestParam String venue,
            @RequestParam long numberOfGuests,
            @RequestParam String entertainmentOptions) {

        Parties parties = Parties.builder()
                .id(id)
                .partyType(partyType)
                .hostName(hostName)
                .date(date)
                .venue(venue)
                .numberOfGuests(numberOfGuests)
                .entertainmentOptions(entertainmentOptions)
                .build();

        System.out.println(parties.toString());

        return "submitted";
    }

}
