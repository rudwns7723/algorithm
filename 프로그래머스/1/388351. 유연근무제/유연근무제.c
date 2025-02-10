#include <stdio.h>
#include <stdbool.h>

int solution(int schedules[], size_t schedules_len, int** timelogs, size_t timelogs_rows, size_t timelogs_cols, int startday) {
    int answer = 0;

    for (int i = 0; i < schedules_len; i++) {
        int currentDay = startday;
        bool success = true;

        for (int j = 0; j < timelogs_cols; j++) {
            if (currentDay > 7) currentDay = 1;

            if (currentDay == 6 || currentDay == 7) {
                currentDay++;
                continue;
            }

            int wishHour = schedules[i] / 100;
            int wishMinute = schedules[i] % 100;
            int allowedTime = wishHour * 100 + (wishMinute + 10);

            if (allowedTime % 100 >= 60) {
                allowedTime += 40; 
            }

            int clockInTime = timelogs[i][j];
            if (clockInTime > allowedTime) {
                success = false;
                break;
            }

            currentDay++;
        }

        if (success) {
            answer++;
        }
    }

    return answer;
}