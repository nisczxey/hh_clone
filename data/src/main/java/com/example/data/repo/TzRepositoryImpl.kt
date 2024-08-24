package com.example.data.repo

import com.example.data.remote.api.TzApi
import com.example.domain.repository.TzRepository

class TzRepositoryImpl(
    val api : TzApi
) : TzRepository {


}