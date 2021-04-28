package com.wilson688.algorithms.other.nearestCity;

/*
A number of pins are placed on a 2D Cartesian grid. Each pin has an x-coordinate, a y coordinate, and a name.

Given a list of target pins, find the pin that share the same x or y coordinates with each of the target pin and return the list. If two pins have the same distance to the target pin, return the pin with the lexicographically smaller name.

Example 1:
Input:
pins = ["a", "b", "c", "d"]

x_coordinates = [50, 60, 100, 200, 300] y_coordinates = [50, 60, 50, 200, 50]

target_pins = ["a", "b","c", "d", "e"]

Output: ["c", "NONE", "a", "NONE", "c"]
Explanation:
a, c and e share the same y coordinate. For a, the closest is c. b shares no x or y coordinate with anyone. c shares the same y coordinate with a and e. The closest is a. d shares no x or y coordinate with anyone. e shares the same y coordinate with a and c. The closest is c.


 */

public class NearestCities {
}
