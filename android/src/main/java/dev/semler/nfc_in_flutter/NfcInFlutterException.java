package dev.semler.nfc_in_flutter;

public class NfcInFlutterException extends Exception {
    String code;
    String message;
    Object details;

    NfcInFlutterException(String code, String message, Object details) {
        this.code = code;
        this.message = message;
        this.details = details;
    }
}
