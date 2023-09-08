package ru.netology.services;

public class RestSchedule {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                money = money - expenses;
                int i = money / 3;
                money = money - (money - i);
                count++;
            } else {
                money = money + (income - expenses);
            }
        }
        return count;
    }
}
