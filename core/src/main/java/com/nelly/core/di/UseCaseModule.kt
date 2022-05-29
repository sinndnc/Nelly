package com.nelly.core.di

import com.nelly.core.domain.usecase.login.LoginUserUseCase
import com.nelly.core.domain.usecase.login.LoginUserUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    @Singleton
    abstract fun bindLoginUseCase(loginUserUseCaseImpl: LoginUserUseCaseImpl): LoginUserUseCase
}