package bluevelvet.blueprint.auth.business

import bluevelvet.blueprint.core.contract.network.AuthNetworkService
import bluevelvet.blueprint.core.exception.InvalidInputException

/**
 * Use case to Signup a user using username, password, and other required information.
 */

class SignupUseCase
constructor (
    private val networkService: AuthNetworkService
) {
    @Throws(InvalidInputException::class)
    suspend operator fun invoke(
        fullName: String,
        gender: Int,
        birthDate: Long,
        username: String,
        password: String
    ) {

        if (username.isEmpty())
            throw InvalidInputException("User name cannot be empty")
        if (password.length < 6)
            throw InvalidInputException("Password should be at least 6 characters")

        networkService.signup(
            fullName = fullName,
            gender = gender,
            birthDate = birthDate,
            username = username,
            password = password,
        )
    }
}