package com.mahmutkayadelen.springbootmicroservice2transaction.service;

import com.mahmutkayadelen.springbootmicroservice2transaction.repository.ITransactionRepository;
import com.mahmutkayadelen.springbootmicroservice2transaction.service.ITransactionService;
import com.mahmutkayadelen.springbootmicroservice2transaction.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author mahmutkayadelen
 * @create 12.12.2021  17:30
 */
@Service
public class TransactionServiceImpl implements ITransactionService {
    @Autowired
    private ITransactionRepository transactionRepository;
    @Override
    public Transaction saveTransation(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());
        return  transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransation(Long id) {
        transactionRepository.deleteById(id);
    }
    @Override
    public List<Transaction> findAllTransactionByUserId(Long userId)
    {
        return transactionRepository.findAllByUserId(userId);
    }
}
