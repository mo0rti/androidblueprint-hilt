package orangevelvet.androidblueprint.hilt.datasource.network.service.fake

import kotlinx.coroutines.delay
import orangevelvet.androidblueprint.hilt.domain.contract.network.DashboardNetworkService
import orangevelvet.androidblueprint.hilt.domain.model.LatestNews
import java.util.*
import javax.inject.Inject

class FakeDashboardNetworkNetworkServiceImpl
@Inject
constructor(): DashboardNetworkService {
    override suspend fun getLatestNews(): List<LatestNews> {
        delay(500)
        return listOf(
            LatestNews(UUID.randomUUID().toString(), "Title 1", "Description 1", "", "https://via.placeholder.com/400x200")
        )
    }
}
