package io.hydok.domain.usecase

import io.hydok.domain.repository.Repository
import javax.inject.Inject

class GetSampleDataUseCase @Inject constructor(private val repository: Repository) {
    operator fun invoke(query: String) {
        repository.getSampleData()
    }
}