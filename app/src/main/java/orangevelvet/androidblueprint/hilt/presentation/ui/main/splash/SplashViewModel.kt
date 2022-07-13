package orangevelvet.androidblueprint.hilt.presentation.ui.main.splash

import dagger.hilt.android.lifecycle.HiltViewModel
import orangevelvet.androidblueprint.core.base.state.view.empty.EmptyViewEvent
import orangevelvet.androidblueprint.core.base.state.view.empty.EmptyViewState
import orangevelvet.androidblueprint.core.base.viewmodel.BaseViewModel
import orangevelvet.androidblueprint.core.domain.contract.session.UserSessionManager
import orangevelvet.androidblueprint.hilt.presentation.navigation.events.MainCoordinatorEvent
import javax.inject.Inject

@HiltViewModel
class SplashViewModel
@Inject
constructor(
    private val userSessionManager: UserSessionManager
) : BaseViewModel<
        EmptyViewState,
        EmptyViewEvent,
        SplashViewAction,
        >() {

    override fun postAction(action: SplashViewAction) {
        when (action) {
            is SplashViewAction.GotoNextScreenAction ->  {
                if (userSessionManager.isUserAuthenticated())
                    sendCoordinatorEvent(MainCoordinatorEvent.AccountFlow)
                else
                    sendCoordinatorEvent(MainCoordinatorEvent.AuthFlow)
            }
        }
    }
}
