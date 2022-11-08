package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
class LoginResponse {
    private String sessionId;
}
