package ru.rakh.microservice_roe_view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.*;

@RestController
//@RequestMapping("/api/v1")
public class UrlController {

    @RequestMapping("/")
    public List<Offer> index(){
        Offer parent = new Offer("Offer 0");
        Offer childOne = new Offer("Offer 1");
        Offer childTwo = new Offer("Offer 2");
        parent.setChild(Collections.singletonList(childOne));
        childOne.setChild(Collections.singletonList(childTwo));
        return Collections.singletonList(parent);
    }

    @RequestMapping("/calendar")
    public String calendar(){
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getDefault());
        calendar.add(Calendar.DAY_OF_MONTH,1);
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        String statusDay = "<span style='color:red'> work</span>";
        StringBuilder result = new StringBuilder();
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        String[] days = dfs.getWeekdays();
        for (int i = 1; i < 70; i++) {
            calendar.add(Calendar.DAY_OF_MONTH,1);
            if(i%3==0){
                statusDay="<span style='color:red'> работают </span>";
            }else{
                statusDay = "не работают";
            }
            result.append(calendar.get(Calendar.DAY_OF_MONTH)).append(" ").append(months[calendar.get(Calendar.MONTH)]).append(" ").append(days[calendar.get(Calendar.DAY_OF_WEEK)]).append(" родители ").append(statusDay).append("</br>");
        }
        return result.toString();
    }
}
