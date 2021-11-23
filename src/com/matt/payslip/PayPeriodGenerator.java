package com.matt.payslip;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PayPeriodGenerator {


//    public boolean validatePayPeriod(String date) {
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMMMMMMMM");
//        simpleDateFormat.setLenient(false);
//        boolean valid = false;
//
//        try {
//            simpleDateFormat.parse(date);
//            System.out.println(date + " is a valid date");
//            valid = true;
//        } catch (ParseException e) {
//            System.out.println(date + " is not a valid date");
//            return false;
//        }
//
//        return valid;
//
//    }


    public String generatePayPeriod(String startDate, String endDate) {

        int startDateSpaceIndex = startDate.indexOf(" ");
        int endDateSpaceIndex = endDate.indexOf(" ");

        int startDay = Integer.parseInt(startDate.substring(0, startDateSpaceIndex));
        int endDay = Integer.parseInt(endDate.substring(0, endDateSpaceIndex));

        String startMonth = startDate.substring(startDateSpaceIndex + 1);
        String endMonth = endDate.substring(endDateSpaceIndex + 1);

        if (startMonth.equalsIgnoreCase("January") && startDay == 1 && endMonth.equalsIgnoreCase("January") && endDay == 31) {
            return "01 January - 31 January";
        }
        else if (startMonth.equalsIgnoreCase("February") && startDay == 1 && endMonth.equalsIgnoreCase("February") && endDay == 28) {
            return "01 February - 28 February";
        }
        else if (startMonth.equalsIgnoreCase("February") && startDay == 1 && endMonth.equalsIgnoreCase("February") && endDay == 29) {
            return "01 February - 29 February";
        }
        else if (startMonth.equalsIgnoreCase("March") && startDay == 1 && endMonth.equalsIgnoreCase("March") && endDay == 31) {
            return "01 March - 31 March";
        }
        else if (startMonth.equalsIgnoreCase("April") && startDay == 1 && endMonth.equalsIgnoreCase("April") && endDay == 30) {
            return "01 April - 30 April";
        }
        else if (startMonth.equalsIgnoreCase("May") && startDay == 1 && endMonth.equalsIgnoreCase("May") && endDay == 31) {
            return "01 May - 31 May";
        }
        else if (startMonth.equalsIgnoreCase("June") && startDay == 1 && endMonth.equalsIgnoreCase("June") && endDay == 30) {
            return "01 June - 30 June";
        }
        else if (startMonth.equalsIgnoreCase("July") && startDay == 1 && endMonth.equalsIgnoreCase("July") && endDay == 31) {
            return "01 July - 31 July";
        }
        else if (startMonth.equalsIgnoreCase("August") && startDay == 1 && endMonth.equalsIgnoreCase("August") && endDay == 31) {
            return "01 August - 31 August";
        }
        else if (startMonth.equalsIgnoreCase("September") && startDay == 1 && endMonth.equalsIgnoreCase("September") && endDay == 30) {
            return "01 September - 30 September";
        }
        else if (startMonth.equalsIgnoreCase("October") && startDay == 1 && endMonth.equalsIgnoreCase("October") && endDay == 31) {
            return "01 October - 31 October";
        }
        else if (startMonth.equalsIgnoreCase("November") && startDay == 1 && endMonth.equalsIgnoreCase("November") && endDay == 30) {
            return "01 November - 31 November";
        }
        else if (startMonth.equalsIgnoreCase("December") && startDay == 1 && endMonth.equalsIgnoreCase("December") && endDay == 31) {
            return "01 December - 31 December";
        }
        else {
            return "Invalid date";
        }

    }

}
