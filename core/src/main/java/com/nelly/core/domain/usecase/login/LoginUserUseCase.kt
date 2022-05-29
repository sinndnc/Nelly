package com.nelly.core.domain.usecase.login

import com.nelly.core.domain.model.LoginModel
import com.nelly.core.util.event.EventResult
import kotlinx.coroutines.flow.*

interface LoginUserUseCase {
    operator fun invoke(loginModel: LoginModel): Flow<EventResult<String?>>
}




