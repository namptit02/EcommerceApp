package org.example.userservice.exception;


public enum ErrorCode {
    //    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
//    INVALID_KEY(1001, "Uncategorized error"),
    USER_EXISTED(400, "Username already exists!"),
    EMAIL_INVALID(400, "Email already exists!"),
//    PRODUCT_NOT_FOUND(1003, "Product not found"),
    USERNAME_INVALID(1004, "Username must be at least 3 characters"),
    INVALID_PASSWORD_LENGTH(1005, "Password must be at least 8 characters")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}