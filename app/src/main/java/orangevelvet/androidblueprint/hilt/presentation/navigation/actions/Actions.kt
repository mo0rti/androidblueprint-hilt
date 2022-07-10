package orangevelvet.androidblueprint.hilt.presentation.navigation.actions

import android.app.Application
import android.content.Intent

/**
 * Inspired by: https://jeroenmols.com/blog/2019/04/02/modularizationexample/
 */
object Actions {
    fun openMainIntent(application: Application) =
        internalIntent(application, "orangevelvet.androidblueprint.hilt.main.open")

    fun openAccountIntent(application: Application) =
        internalIntent(application, "orangevelvet.androidblueprint.hilt.account.open")

    private fun internalIntent(application: Application, action: String) =
        Intent(action).setPackage(application.packageName)
}
