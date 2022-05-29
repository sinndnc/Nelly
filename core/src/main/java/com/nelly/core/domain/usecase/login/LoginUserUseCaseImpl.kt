package com.nelly.core.domain.usecase.login

import com.nelly.core.di.IoDispatcher
import com.nelly.core.domain.model.LoginModel
import com.nelly.core.domain.repository.LoginRepository
import com.nelly.core.util.event.EventResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class LoginUserUseCaseImpl @Inject constructor(
    private val repository: LoginRepository,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : LoginUserUseCase {

    override fun invoke(loginModel: LoginModel): Flow<EventResult<String?>> =
        flow {
            emit(EventResult.Loading)
            val response = repository.loginWithEmailAndPassword(loginModel).await()
            if (response.user != null ) {
                emit(EventResult.Success(response.user!!.uid))
            }
        }.catch { error ->
            emit(EventResult.Error(error))
        }.flowOn(dispatcher)
}
