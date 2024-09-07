package BittWise;

public class LotsAboutithBit {
    public static void main(String[] args) {


        System.out.println(  "number of bits in the number 10 is " + howManyBits(10,2));



        // this linw will be converted into the binary number and then found the thing for 7 = 111 so ans is 1
        int nums  = 0;
        int i = 1;  // for the index
        // Print the initial state of the bit at position i
        System.out.println("Bit at position " + i + " before setting: " + IthBit(nums, i)); // Expected output: 0

        // Set the bit at position i
        nums = setIthBit(nums, i);
        System.out.println("Bit at position " + i + " after setting: " + IthBit(nums, i)); // Expected output: 1

        // Reset (clear) the bit at position i
        nums = resetIthBit(nums, i);
        System.out.println("Bit at position " + i + " after resetting: " + IthBit(nums, i)); // Expected output: 0

        // Additional positions to test
        int[] positions = {0, 2, 3}; // Positions to test

        for (int pos : positions) {
            nums = 0; // Reset nums to 0 for each test
            System.out.println("\nTesting bit position " + pos + ":");

            // Print the initial state of the bit at position pos
            System.out.println("Bit at position " + pos + " before setting: " + IthBit(nums, pos)); // Expected output: 0

            // Set the bit at position pos
            nums = setIthBit(nums, pos);
            System.out.println("Bit at position " + pos + " after setting: " + IthBit(nums, pos)); // Expected output: 1

            // Reset (clear) the bit at position pos
            nums = resetIthBit(nums, pos);
            System.out.println("Bit at position " + pos + " after resetting: " + IthBit(nums, pos)); // Expected output: 0
        }


    }

    private static int resetIthBit(int nums, int i) {
        int mask  = ~(1 << i );     // do negative of this number
        return nums & mask ;
    }

    private static int setIthBit(int nums, int i) {
        int mask = 1 << i;
        return nums | mask ;
    }

    static int IthBit(int num ,int i){
        int mask = 1 << i;
        return (num & mask)!= 0 ? 1 : 0;
    }



    static int rightmostSetBit(int nums){
        return nums & -nums;
    }



    static int howManyBits(int num ,int base){
        return (int)(Math.log(num) / Math.log(base)) + 1;
    }
}
