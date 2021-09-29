/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author admin
 */
public class dateObject {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        System.out.println("DateTime: " + myDateTime
                           + "\nDate: " + myDate
                           + "\nTime: " + myTime);
        
        myDate = myDate.minusMonths(9);
        myDate = myDate.plusDays(14);
        System.out.println("Today's date: " + myDate);
        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Japanese date: " + jDate);
        
        String sDate = myDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format: " + sDate);
        
        String fDate = myDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Formatted with MEDIUM FormatStyle: " + fDate);
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyy/ HH:mm:ss");
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
