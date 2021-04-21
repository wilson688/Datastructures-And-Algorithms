package com.wilson688.algorithms.strings;

public class RobotBoundedInCircle {

    public boolean isRobotBounded(String instructions) {

        int length = instructions.length();
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] position = {0, 0};
        int init_direction = 0;

        for (int i = 0; i < length; i++) {
            char currChar = instructions.charAt(i);

            if (currChar == 'L') {
                init_direction = (init_direction + 3) % 4;
            } else if (currChar == 'R') {
                init_direction = (init_direction + 1) % 4;
            } else {
                position[0] += directions[init_direction][0];
                position[1] += directions[init_direction][1];
            }

        }

        if (position[0] == 0 && position[1] == 0 || init_direction != 0) return true;

        return false;
    }


    public static void main(String[] args) {
        RobotBoundedInCircle robot = new RobotBoundedInCircle();

        System.out.println(robot.isRobotBounded("GGLLGG") == true);
        System.out.println(robot.isRobotBounded("GG") == false);
        System.out.println(robot.isRobotBounded("GL") == true);
    }
}
