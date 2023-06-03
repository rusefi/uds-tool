package com.rusefi.uds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecurityTest {
    @Test
    public void testCalcKey() {
        int key = KeyCalculator.udsSecurityCalcKey(0x5D8A2010, 0xF0);
        assertEquals("Got " + String.format("%x", key), 0xc42f15ae, key);
    }
}
