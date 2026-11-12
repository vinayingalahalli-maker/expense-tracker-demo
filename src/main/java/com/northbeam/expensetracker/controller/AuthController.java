package com.northbeam.expensetracker.controller;

import com.northbeam.expensetracker.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Convenience endpoint to get a JWT for local testing.
 * POST /auth/token?userId=user_101&role=Employee
 * Roles: Employee | Approver | Finance
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final JwtUtil jwtUtil;

    @PostMapping("/token")
    public ResponseEntity<Map<String, String>> token(
            @RequestParam String userId,
            @RequestParam(defaultValue = "Employee") String role) {
        String token = jwtUtil.generateToken(userId, role);
        return ResponseEntity.ok(Map.of("token", token));
    }
}
