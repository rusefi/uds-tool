package com.rusefi.uds;

public class KeyCalculator {
    private static final int MAIN_APP_SECRET = 0x57649392;
    private static final int BOOTLOADER_SECRET = 0xB24F5249;

    public static int udsBootloaderSecurityCalcKey(int seed, int rnd) {
        return udsSecurityCalcKey(BOOTLOADER_SECRET, seed, rnd);
    }

    public static int udsMainAppSecurityCalcKey(int seed, int rnd) {
        return udsSecurityCalcKey(MAIN_APP_SECRET, seed, rnd);
    }

    private static int udsSecurityCalcKey(int secret, int seed, int rnd) {
        if (rnd < 220) {
            rnd += 35;
        } else {
            rnd = 255;
        }

        for (int i = 0; i < rnd; i++) {
            if (seed < 0) {
                seed = secret ^ seed << 1;
            } else {
                seed <<= 1;
            }
        }
        return seed;
    }
}
