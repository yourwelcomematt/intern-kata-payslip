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

        if (startMonth.equals("January") && startDay == 1 && endMonth.equals("January") && endDay == 31) {
            return "01 January - 31 January";
        }
        else if (startMonth.equals("February") && startDay == 1 && endMonth.equals("February") && endDay == 28) {
            return "01 February - 28 February";
        }
        else if (startMonth.equals("February") && startDay == 1 && endMonth.equals("February") && endDay == 29) {
            return "01 February - 29 February";
        }
        else if (startMonth.equals("March") && startDay == 1 && endMonth.equals("March") && endDay == 31) {
            return "01 March - 31 March";
        }
        else if (startMonth.equals("April") && startDay == 1 && endMonth.equals("April") && endDay == 30) {
            return "01 April - 30 April";
        }
        else if (startMonth.equals("May") && startDay == 1 && endMonth.equals("May") && endDay == 31) {
            return "01 May - 31 May";
        }
        else if (startMonth.equals("June") && startDay == 1 && endMonth.equals("June") && endDay == 30) {
            return "01 June - 30 June";
        }
        else if (startMonth.equals("July") && startDay == 1 && endMonth.equals("July") && endDay == 31) {
            return "01 July - 31 July";
        }
        else if (startMonth.equals("August") && startDay == 1 && endMonth.equals("August") && endDay == 31) {
            return "01 August - 31 August";
        }
        else if (startMonth.equals("September") && startDay == 1 && endMonth.equals("September") && endDay == 30) {
            return "01 September - 30 September";
        }
        else if (startMonth.equals("October") && startDay == 1 && endMonth.equals("October") && endDay == 31) {
            return "01 October - 31 October";
        }
        else if (startMonth.equals("November") && startDay == 1 && endMonth.equals("November") && endDay == 30) {
            return "01 November - 31 November";
        }
        else if (startMonth.equals("December") && startDay == 1 && endMonth.equals("December") && endDay == 31) {
            return "01 December - 31 December";
        }
        else {
            return "Invalid date";
        }

    }

}
