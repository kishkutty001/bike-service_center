package com.simats.bikeservice.model

data class LoginResponse(
    val status: String,
    val message: String,
    val data: UserData?
)

data class UserData(
    val id: String,
    val name: String,
    val email: String,
    val user_type: String
)
