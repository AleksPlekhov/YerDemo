package com.aquayer.utils

sealed class Result<S, E>

data class Success<S, E>(val value: S) : Result<S, E>()

data class Error<S, E>(val value: E) : Result<S, E>()








