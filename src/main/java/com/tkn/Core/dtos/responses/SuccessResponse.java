package com.tkn.Core.dtos.responses;

public record SuccessResponse<T>(Boolean Success, String Message, T Content) {
    public SuccessResponse {
        if (Success == null) Success = true;
        if (Message == null) Message = "Registros recuperados com sucesso";
    }
}
