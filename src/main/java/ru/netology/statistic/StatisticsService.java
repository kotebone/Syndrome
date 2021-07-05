package ru.netology.statistic;

public class StatisticsService {
  private long current;

  /**
   * Calculate index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    long current_max_index = 0;
    long current_max = incomes[0];
    for (long income : incomes)
      if (current_max < income)
        current_max = income;
    return current_max;
  }

  public long findMin(long[] incomes) {
    long current_min_index = 0;
    long current_min = incomes[0];
    for (long income : incomes)
      if (current_min > income)
        current_min = income;
    return current_min;
  }

  public long calcSum(long[] incomes) {
    long sum = 0;
    for (long income : incomes) {
      sum += income;
    }
    return sum;
  }

  public long calcMiddleSum(long[] incomes) {
    return calcSum(incomes) / incomes.length;
  }

  public long sumUnderMiddle(long[] incomes) {
    long middleSum = calcMiddleSum(incomes);
    long sumUnder = 0;
    for (long income : incomes) {
      if (middleSum < income) {
        sumUnder++;
      }
    }
    return sumUnder;
  }

  public int sumUpMiddle(long[] incomes) {
    long middleSum = calcMiddleSum(incomes);
    int sumUp = 0;
    for (long income : incomes) {
      if (middleSum > income) {
        sumUp++;
      }
    }
    return sumUp;
  }

  public long getMin(long[] incomes) {
    long min = incomes[0];
    for (long income : incomes) {
      if (income < min) {
        min = income;
      }
    }
    return min;
  }

  public long getMax(long[] incomes) {
    long max = incomes[0];
    for (long income : incomes) {
      if (income > max) ;
    }
    return max;
  }
}