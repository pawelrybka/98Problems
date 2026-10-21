package com.example.demo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController {
    @PostMapping
    fun createUser(@RequestBody request: CreateUserRequest): UserResponse {
        return UserResponse(
            id = 1L,
            name = request.name,
            email = request.email
        )
    }
}

data class CreateUserRequest(
    val name: String,
    val email: String
)

data class UserResponse(
    val id: Long,
    val name: String,
    val email: String
)