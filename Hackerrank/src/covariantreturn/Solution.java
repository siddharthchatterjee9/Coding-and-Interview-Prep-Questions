package covariantreturn;

import java.util.Scanner;

class Flower {
    String whatsYourName() {
        return "I have many names and types";
    }
}
class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}
class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}
class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}
class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}
class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}
public class Solution {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Region region = null;
        switch (s) {
            case "West Bengal":
                region = new WestBengal();
                break;
            case "Andhra Pradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
