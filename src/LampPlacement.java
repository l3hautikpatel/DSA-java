public class LampPlacement {
    public static int placeLamp(int[] objects, int radius) {
        int maxIlluminated = 0;
        int bestPosition = objects[0]; // Initialize with the first object

        // We want to check all positions from min possible to max possible (based on the radius)
        int minCoordinate = objects[0] - radius;
        int maxCoordinate = objects[objects.length - 1] + radius;

        // Iterate through all possible positions from min to max coordinate
        for (int pos = minCoordinate; pos <= maxCoordinate; pos++) {
            int illuminatedCount = 0;

            // Count how many objects fall within the range illuminated by a lamp at 'pos'
            for (int obj : objects) {
                if (obj >= pos - radius && obj <= pos + radius) {
                    illuminatedCount++;
                }
            }

            // Update the best position if more objects are illuminated or the same but smaller position
            if (illuminatedCount > maxIlluminated) {
                maxIlluminated = illuminatedCount;
                bestPosition = pos;
            } else if (illuminatedCount == maxIlluminated && pos < bestPosition) {
                bestPosition = pos;
            }
        }

        return bestPosition;
    }

    public static void main(String[] args) {
        // Test case with negative and positive numbers
        int[] objects1 = {-10, -5, -2, 0, 3, 5, 9};
        int radius1 = 4;
        System.out.println("Best coordinate to place the lamp: " + placeLamp(objects1, radius1));

        // Another test case
        int[] objects2 = {-20, -15, -10, -2, 2, 6, 10, 15};
        int radius2 = 5;
        System.out.println("Best coordinate to place the lamp: " + placeLamp(objects2, radius2));
        // Another test case
        int[] objects3 = {-1000000000};
        int radius3 = -100000;
        System.out.println("Best coordinate to place the lamp: " + placeLamp(objects3, radius3));
    }
}
