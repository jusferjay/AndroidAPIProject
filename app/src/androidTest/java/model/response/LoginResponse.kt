package model.response

data class LoginResponse(
    val token: String,
    val message: String
)