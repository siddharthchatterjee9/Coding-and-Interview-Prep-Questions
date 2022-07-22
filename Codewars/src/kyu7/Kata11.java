package kyu7;

// https://www.codewars.com/DiceRotations/5ff2093d375dca00170057bc/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata11 {
    @Test
    public void testCase1() {
        assertEquals(2 , DiceRotations.rotations(new int[] {1,1,6}));
    }
    @Test
    public void testCase2() {
        assertEquals(2 , DiceRotations.rotations(new int[] {1,2,3}));
    }
    @Test
    public void testCase3() {
        assertEquals(0 , DiceRotations.rotations(new int[] {3,3,3}));
    }
    @Test
    public void testCase4() {
        assertEquals(3 , DiceRotations.rotations(new int[] {1,6,2,3}));
    }
}

class DiceRotations {
    public static int rotations(int[] dieArray) {
        int[] ways = new int[dieArray.length];
        int round = 0;
        for (int i = 0; i < dieArray.length; i++) {
            switch (dieArray[i]) {
                case 1:
                    for (int x : dieArray) {
                        if (x == 6) {
                            round += 2;
                        }
                        else if (x != 1) {
                            round++;
                        }
                    }
                    break;
                case 2:
                    for (int x : dieArray) {
                        if (x == 5) {
                            round += 2;
                        }
                        else if (x != 2) {
                            round++;
                        }
                    }
                    break;
                case 3:
                    for (int x : dieArray) {
                        if (x == 4) {
                            round += 2;
                        }
                        else if (x != 3) {
                            round++;
                        }
                    }
                    break;
                case 4:
                    for (int x : dieArray) {
                        if (x == 3) {
                            round += 2;
                        }
                        else if (x != 4) {
                            round++;
                        }
                    }
                    break;
                case 5:
                    for (int x : dieArray) {
                        if (x == 2) {
                            round += 2;
                        }
                        else if (x != 5) {
                            round++;
                        }
                    }
                    break;
                case 6:
                    for (int x : dieArray) {
                        if (x == 1) {
                            round += 2;
                        }
                        else if (x != 6) {
                            round++;
                        }
                    }
                    break;
            }
            ways[i] = round;
        }
        int answer = ways.length > 0 ? ways[0] : 0;
        for (int way : ways) {
            if (answer >= way) {
                answer = way;
            }
        }
        return answer;
    }
}