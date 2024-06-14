package com.example.Dashboard.repository;


import com.example.Dashboard.model.AccountSummary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountSummaryRepository extends ReactiveMongoRepository<AccountSummary, String> {
}

