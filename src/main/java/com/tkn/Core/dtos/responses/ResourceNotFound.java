package com.tkn.Core.dtos.responses;

import com.tkn.Core.models.Clientes;

public record ResourceNotFound<T>(Boolean Success, String Message, T Content) {
}
