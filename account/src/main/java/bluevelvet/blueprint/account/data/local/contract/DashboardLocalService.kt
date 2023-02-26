package bluevelvet.blueprint.account.data.local.contract

import bluevelvet.blueprint.core.domain.model.Category
import bluevelvet.blueprint.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface DashboardLocalService {
    fun getCategories(): Flow<List<Category>>
    suspend fun insertOrUpdateCategories(categories: List<Category>)
    suspend fun insertOrUpdatePopularProducts(popularProducts: List<Product>)
}