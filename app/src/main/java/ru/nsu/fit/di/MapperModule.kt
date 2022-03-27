package ru.nsu.fit.di

import dagger.Binds
import dagger.Module
import ru.nsu.fit.data.mapper.*
import ru.nsu.fit.data.model.*
import ru.nsu.fit.domain.model.*

@Module
interface MapperModule {
    @Binds
    fun bindSimpleBicycleMapper(mapper: SimpleBicycleMapper): Mapper<SimpleBicycle, BicycleSimplified>

    @Binds
    fun bicycleMapper(mapper: BicycleMapper): Mapper<Bicycle, BicycleAllSpecs>

    @Binds
    fun bindTypeMapper(mapper: TypeMapper): Mapper<Type, BicycleType>

    @Binds
    fun bindColorMapper(mapper: ColorMapper): Mapper<Color, ColorDto>

    @Binds
    fun bindStateMapper(mapper: StateMapper): Mapper<State, BicycleState>

    @Binds
    fun bindIssueMapper(mapper: IssueMapper): Mapper<Issue, IssueDto>
}