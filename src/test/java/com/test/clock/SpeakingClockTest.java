package com.test.clock;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class SpeakingClockTest {

  @Test
  public void when_TimeEightyThirtyFour_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String currentTimeInWords = speakingClock.timeInWords(LocalTime.of(8, 34));

    assertEquals("Good Morning, It's eight thirty four",  currentTimeInWords);
  }

  @Test
  public void when_TimeMidnight_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String currentTimeInWords = speakingClock.timeInWords(LocalTime.of(0, 00));

    assertEquals("Good Morning, It's Midnight",  currentTimeInWords);
  }

  @Test
  public void when_TimeMidday_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String timeInWords = speakingClock.timeInWords(LocalTime.of(12, 00));

    assertEquals("Good Afternoon, It's Midday",  timeInWords);
  }

  @Test
  public void when_TimeMorning_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String timeInWords = speakingClock.timeInWords(LocalTime.of(11, 59));

    assertEquals("Good Morning, It's eleven fifty nine",  timeInWords);
  }

  @Test
  public void when_TimeSeventeenFiftyNine_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String timeInWords = speakingClock.timeInWords(LocalTime.of(17, 59));

    assertEquals("Good Afternoon, It's seventeen fifty nine",  timeInWords);
  }

  @Test
  public void when_TimeTwentyTwoTwentyNine_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String timeInWords = speakingClock.timeInWords(LocalTime.of(22, 29));

    assertEquals("Good Evening, It's twenty two twenty nine",  timeInWords);
  }

  @Test
  public void when_TimeTwentyThreeFiftyNine_thenReturnInWords() {

    final SpeakingClock speakingClock = new SpeakingClock();
    final String currentTimeInWords = speakingClock.timeInWords(LocalTime.of(23, 59));

    assertEquals("Good Night, It's twenty three fifty nine",  currentTimeInWords);
  }

}
