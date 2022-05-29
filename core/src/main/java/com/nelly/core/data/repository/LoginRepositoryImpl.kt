package com.nelly.core.data.repository

import com.nelly.core.domain.model.LoginModel
import com.nelly.core.domain.repository.LoginRepository
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject


class LoginRepositoryImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : LoginRepository {

    override fun loginWithEmailAndPassword(loginModel: LoginModel): Task<AuthResult> =
        firebaseAuth.signInWithEmailAndPassword(loginModel.email, loginModel.password)

}
