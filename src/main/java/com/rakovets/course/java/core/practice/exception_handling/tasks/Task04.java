package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.carIsDriveException;

public class Task04 {
    private String message;


    public Task04(String message) {
        this.message = message;
    }
    public static String getCarCapacity(int weightOfCar) throws carIsDriveException {
        final int MAX_WEIGHT_CAR = 1000;
        final String CAN_DRIVE = "We are driving!";
        if(weightOfCar < MAX_WEIGHT_CAR) {
            return CAN_DRIVE;
        } else {
            throw new carIsDriveException("We cannot drive! The car is overloaded.");
        }
    }
}
