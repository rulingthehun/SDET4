package Utility;

import java.util.Scanner;

public class MyFunc {
    public static void Bekle(double saniye){
        try {
            Thread.sleep((long) (saniye*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
