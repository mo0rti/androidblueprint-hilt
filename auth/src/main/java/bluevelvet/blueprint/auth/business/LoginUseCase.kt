package bluevelvet.blueprint.auth.business

import bluevelvet.blueprint.core.contract.network.AuthNetworkService
import bluevelvet.blueprint.core.exception.InvalidInputException

/**
 * Use case to authenticate a user using username and password.
 */

class LoginUseCase
constructor (
    private val networkService: AuthNetworkService
) {
    @Throws(InvalidInputException::class)
    suspend operator fun invoke(username: String, password: String) {

        if (username.isEmpty())
            throw InvalidInputException("User name cannot be empty")
        if (password.length < 6)
            throw InvalidInputException("Password should be at least 6 characters")

        networkService.login(
            username = username,
            password = password
        )
    }
}