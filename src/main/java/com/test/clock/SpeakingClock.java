package com.test.clock;

import java.time.LocalTime;

/**
 * A Speaking clock that converts a time digits into words along with a greeting
 */
public class SpeakingClock {

  public static final String MORNING = "Morning";
  public static final String AFTERNOON = "Afternoon";
  public static final String EVENING = "Evening";
  public static final String NIGHT = "Night";

  public String timeInWords(LocalTime time) {

    final String hour = TimeNumberToWords.toWords(time.getHour());
    final String minute =  TimeNumberToWords.toWords(time.getMinute());

    if (isMidday(time)) {
      return String.format("%s, It's%s", getGreeting(time), TimeNumberToWords.getMiddayWord());
    } else if (isMidnight(time)) {
      return String.format("%s, It's%s", getGreeting(time), TimeNumberToWords.getMidnightWord());
    }

    return String.format("%s, It's%s%s", getGreeting(time), hour, minute);
  }

  protected String getGreeting(LocalTime time) {

    LocalTime startOfEvening = LocalTime.parse("18:00");
    LocalTime startOfNight = LocalTime.parse("22:30");
    String periodOfDay;


    if (time.isBefore(LocalTime.NOON)) {
      periodOfDay = MORNING;
    } else if (time.isBefore(startOfEvening)) {
      periodOfDay = AFTERNOON;
    } else if (time.isBefore(startOfNight)) {
      periodOfDay = EVENING;
    } else {
      periodOfDay = NIGHT;
    }

    return String.format("Good %s", periodOfDay);
  }

  public String currentTimeInWords() {
    return timeInWords(LocalTime.now());
  }

  protected boolean isMidnight(LocalTime time) {

    return LocalTime.MIDNIGHT.equals(time);
  }

  protected boolean isMidday(LocalTime time) {

    return LocalTime.NOON.equals(time);
  }
}
