package bluevelvet.blueprint.account.di

import bluevelvet.blueprint.account.data.local.contract.DashboardLocalService
import bluevelvet.blueprint.account.data.local.service.DashboardLocalServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class LocalServiceModule {

    @ViewModelScoped
    @Binds
    abstract fun bindDashboardLocalService(
        localService: DashboardLocalServiceImpl
    ): DashboardLocalService
}
