package com.tkn.Core.dtos.user;

import com.tkn.Core.enums.UserRole;

public record RegisterDTO (String login, String password, UserRole role) {
}
