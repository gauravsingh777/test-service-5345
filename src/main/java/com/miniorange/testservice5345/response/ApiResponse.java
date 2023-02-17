package com.miniorange.testservice5345.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ApiResponse {

    private Integer	statusCode; // 200 or 401 etc
    private String	message;

    private Object object;


    public ApiResponse(Integer statusCode, String message)
    {
        this.statusCode = statusCode;
        this.message = message;
    }

    public ApiResponse(Integer statusCode, String message, Object object)
    {
        this.statusCode = statusCode;
        this.message = message;
        this.object = object;
    }
}
