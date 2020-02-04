package com.orion.orionchat.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.Patterns
import com.orion.orionchat.data.LoginRepository
import com.orion.orionchat.data.Result

import com.orion.orionchat.R
import com.orion.orionchats.exception.OrionChatException
import com.orion.orionchats.managers.LoginManager


class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {

    private val _loginForm = MutableLiveData<LoginFormState>()
    val loginFormState: LiveData<LoginFormState> = _loginForm

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult

    fun login(username: String, password: String) {
        // can be launched in a separate asynchronous job
        val result = loginRepository.login(username, password)

        if (result is Result.Success) {
            _loginResult.value = LoginResult(success = LoggedInUserView(displayName = result.data.displayName))
        } else {
            _loginResult.value = LoginResult(error = R.string.login_failed)
        }
    }


    fun performLogin(userId: String, password: String) {

       LoginManager.login(userId, password, object : LoginManager.CallbackListener<String>() {
            override fun onSuccess(user: String?) {
                // Hide Progress Bar
//                progressLoading.visibility = View.GONE

                _loginResult.value = LoginResult(success = user?.let { LoggedInUserView(displayName = it) })
                if (user != null)
                {
                    // Go to Contacts screen
//                    var intent = Intent(this@LoginActivity, HomeActivity::class.java)
//                    context.startActivity(intent)
//                    finish()
                }
                else
                {
//                    Toast.makeText(this@LoginActivity, "Couldn't find the user", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onError(exception: OrionChatException?) {

                _loginResult.value = LoginResult(error = R.string.login_failed)
                // Hide Progress Bar
//                progressLoading.visibility = View.GONE
//                btnLogin.visibility = View.VISIBLE
//                txtUsername.isEnabled = true

//                Toast.makeText(this@LoginActivity, exception?.localizedMessage ?: "Unknown Error Occurred!", Toast.LENGTH_SHORT).show()
            }
        })
    }







    fun loginDataChanged(username: String, password: String) {
        if (!isUserNameValid(username)) {
            _loginForm.value = LoginFormState(usernameError = R.string.invalid_username)
        } else if (!isPasswordValid(password)) {
            _loginForm.value = LoginFormState(passwordError = R.string.invalid_password)
        } else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }

    // A placeholder username validation check
    private fun isUserNameValid(username: String): Boolean {
        return if (username.contains('@')) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }

    // A placeholder password validation check
    private fun isPasswordValid(password: String): Boolean {
        return password.length > 5
    }
}
