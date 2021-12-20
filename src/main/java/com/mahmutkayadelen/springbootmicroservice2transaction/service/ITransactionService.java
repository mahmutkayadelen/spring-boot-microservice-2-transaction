package com.mahmutkayadelen.springbootmicroservice2transaction.service;

import com.mahmutkayadelen.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

/**
 * @Author mahmutkayadelen
 * @create 12.12.2021  17:30
 */
public interface ITransactionService {
    public Transaction saveTransation(Transaction transaction);
    public void deleteTransation(Long id);
    public List<Transaction> findAllTransactionByUserId(Long userId);


}
