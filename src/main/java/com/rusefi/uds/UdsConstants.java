package com.rusefi.uds;

public interface UdsConstants {
    byte DiagnosticSessionControl = 0x10;

    byte DiagnosticSessionControlResponse = 0x50;
    byte DSC_ProgrammingSession = 2;

    byte ECUReset = 0x11;

    byte SecurityAccess = 0x27;

    byte SecurityAccessResponse = 0x67;

    byte TransferData = 0x36;

    byte RequestTransferExit = 0x37;
}
