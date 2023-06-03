package com.rusefi.uds;

public class KeyCalculator {
    //private static final int SECRET = 0x57649392;
    private static final int BOOTLOADER_SECRET = 0xB24F5249;

    public static int udsSecurityCalcKey(int seed, int rnd) {
        if (rnd < 220) {
            rnd += 35;
        } else {
            rnd = 255;
        }

        for (int i = 0; i < rnd; i++) {
            if (seed < 0) {
                seed = BOOTLOADER_SECRET ^ seed << 1;
            } else {
                seed <<= 1;
            }
        }
        return seed;
    }
}
