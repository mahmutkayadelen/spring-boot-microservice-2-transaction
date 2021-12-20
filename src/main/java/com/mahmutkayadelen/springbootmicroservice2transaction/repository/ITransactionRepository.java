package com.mahmutkayadelen.springbootmicroservice2transaction.repository;

import com.mahmutkayadelen.springbootmicroservice2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author mahmutkayadelen
 * @create 12.12.2021  17:25
 */
public interface ITransactionRepository extends JpaRepository<Transaction,Long> {
   List<Transaction> findAllByUserId(Long userId);
}
