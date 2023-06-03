package com.rusefi.uds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecurityTest {
    @Test
    public void testCalcKey() {
        {
            int key = KeyCalculator.udsBootloaderSecurityCalcKey(0x5D8A2010, 0xF0);
            assertEquals("Got " + String.format("%x", key), 0xc42f15ae, key);
        }
        {
            int key = KeyCalculator.udsBootloaderSecurityCalcKey(0x5D8A202C, 0xF0);
            assertEquals("Got " + String.format("%x", key), 0xAEE52AA2, key);
        }
        {
            int key = KeyCalculator.udsMainAppSecurityCalcKey(0x5DA0B808, 0xA4);
            assertEquals("Got " + String.format("%x", key), 0x001B6F78, key);
        }
    }
}
