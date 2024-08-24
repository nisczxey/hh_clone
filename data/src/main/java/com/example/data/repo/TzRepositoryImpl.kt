package com.example.data.repo

import com.example.data.remote.service.TzNetworkService
import com.example.domain.repository.TzRepository

class TzRepositoryImpl(
    val service: TzNetworkService
) : TzRepository {


}