package orangevelvet.androidblueprint.hilt.domain.manager

import orangevelvet.androidblueprint.hilt.domain.contract.session.ApplicationStateManager
import orangevelvet.androidblueprint.hilt.domain.contract.session.UserSessionManager
import javax.inject.Inject

class UserSessionManagerImpl
@Inject
constructor(
    private val applicationStateManager: ApplicationStateManager
): UserSessionManager {

    private var _accessToken: String

    init {
        _accessToken = applicationStateManager.loadState().authToken
    }

    override fun isUserAuthenticated(): Boolean {
        return _accessToken.isNotEmpty()
    }

    override fun logout() {
        _accessToken = ""
    }

    override fun login() {
        _accessToken = "AAA"
        val applicationState = applicationStateManager.loadState()
        applicationStateManager.saveState(
            applicationState.copy(
                authToken = _accessToken
            ))
    }
}