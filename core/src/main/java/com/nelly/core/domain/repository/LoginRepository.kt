package com.nelly.core.domain.repository

import com.nelly.core.domain.model.LoginModel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface LoginRepository {

    fun loginWithEmailAndPassword(loginModel: LoginModel): Task<AuthResult>

}