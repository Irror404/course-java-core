package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte dayOfWeekNumber = 5;

        String nameWeekday = getDayOfWeekNumber(dayOfWeekNumber);
        System.out.printf("Result: %s", nameWeekday);
    }

    /**
     * Возвращает название дня недели, в зависимости от его порядкового номера.
     *
     * @param dayOfWeekNumber номер дня недели
     * @return день недели на английском языке (UPPER CASE)
     */
    static String getDayOfWeekNumber(byte dayOfWeekNumber) {
        String dayString = null;

        switch (dayOfWeekNumber) {
            case 1:
                dayString = "MONDAY";
                break;
            case 2:
                dayString = "TUESDAY";
                break;
            case 3:
                dayString = "WEDNESDAY";
                break;
            case 4:
                dayString = "THURSDAY";
                break;
            case 5:
                dayString = "FRIDAY";
                break;
            case 6:
                dayString = "SATURDAY";
                break;
            case 7:
                dayString = "SUNDAY";
                break;
            default:
                dayString = null;
            }
        return dayString;
    }
}
