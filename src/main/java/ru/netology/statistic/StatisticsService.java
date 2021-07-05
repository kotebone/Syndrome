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

  public int calcSum(long[] incomes) {
    int sum = 0;
    for (long income : incomes) {
      sum += income;
    }
    return sum;
  }

  public int calcMiddleSum(long[] incomes) {
    return calcSum(incomes) / incomes.length;
  }

  public int sumUnderMiddle(long[] incomes) {
    int middleSum = calcMiddleSum(incomes);
    int sumUnder = 0;
    for (long income : incomes) {
      if (middleSum < income) {
        sumUnder++;
      }
    }
    return sumUnder;
  }

  public int sumUpMiddle(long[] incomes) {
    int middleSum = calcMiddleSum(incomes);
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
      if (income > max) {
        max = income;
      }
    }
    return max;
  }

  public long getCurrent(long[] incomes) {
    long max = incomes[0];
    long min = incomes[0];
    if (current > max) {
      return current;
    }
    if (current < min) {
      return current;
    }
    this.current = current;
    return current;
  }
}