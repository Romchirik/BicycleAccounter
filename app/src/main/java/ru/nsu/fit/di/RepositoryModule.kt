package ru.nsu.fit.di

import dagger.Binds
import dagger.Module
import ru.nsu.fit.data.repository.*
import ru.nsu.fit.domain.model.Customer
import ru.nsu.fit.domain.repository.*

@Module
interface RepositoryModule {
    @Binds
    fun bindBicycleRepository(repo: BicycleManagerImpl): BicycleRepository

    @Binds
    fun bindColorRepository(repo: ColorRepositoryImpl): ColorRepository

    @Binds
    fun bindStateRepository(repo: StateRepositoryImpl): StateRepository

    @Binds
    fun bindTypeRepository(repo: TypeRepositoryImpl): TypeRepository

    @Binds
    fun bindWheelSizeRepository(repo: WheelSizeRepositoryImpl): WheelSizeRepository

    @Binds
    fun bindSalesRepository(repo: SalesRepositoryImpl): SalesRepository

    @Binds
    fun bindCustomerRepository(repo: CustomerRepositoryImpl): CustomerRepository
}