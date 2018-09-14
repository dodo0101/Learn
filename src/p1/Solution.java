package p1;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    
    public static int println(Bridge bridge) {
        return bridge.getCarsCount();
    }
    
}

