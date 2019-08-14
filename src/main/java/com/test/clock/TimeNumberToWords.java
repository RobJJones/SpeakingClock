package com.test.clock;

/**
 * Converts any numbers that occur in a time to numbers. For example 59, will be 'fifty nine'
 */
public class TimeNumberToWords {

  private static final String[] numbersToNineteen = {" zero", " one", " two", " three", " four", " five",
    " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
    " seventeen", " eighteen", " nineteen"};

  private static final String WORD_TWENTY = " twenty";
  private static final String WORD_THIRTY = " thirty";
  private static final String WORD_FORTY = " fourty";
  private static final String WORD_FIFTY = " fifty";
  private static final int NUMBER_TWENTY = 20;
  private static final int NUMBER_THIRTY = 30;
  private static final int NUMBER_FOURTY = 40;
  private static final int NUMBER_FIFTY = 50;
  private static final int NUMBER_SIXTY = 60;
  private static final String MIDNIGHT = " Midnight";
  private static final String MIDDAY = " Midday";

  /**
   * @param number A number contained in time (1-59)
   * @return number converted to a string
   */
  public static String toWords(int number) {

    String word = "";

    if (number < NUMBER_TWENTY) {
      return numbersToNineteen[number];
    } else if (number < NUMBER_THIRTY) {
      word = WORD_TWENTY;
    } else if (number < NUMBER_FOURTY) {
      word = WORD_THIRTY;
    } else if (number < NUMBER_FIFTY) {
      word = WORD_FORTY;
    } else if (number < NUMBER_SIXTY) {
      word = WORD_FIFTY;
    } else {
      return word;
    }

    int remainingNumber = number % 10;

    if (remainingNumber > 0) {
      word += numbersToNineteen[remainingNumber];
    }

    return word;
  }

  /**
   * @return Text representation of the time at midnight
   */
  public static final String getMidnightWord() {
    return MIDNIGHT;
  }

  /**
   * @return Text representation of the time at midday
   */
  public static final String getMiddayWord() {
    return MIDDAY;
  }
}
