package com.mahmutkayadelen.springbootmicroservice2transaction.controller;

import com.mahmutkayadelen.springbootmicroservice2transaction.service.ITransactionService;
import com.mahmutkayadelen.springbootmicroservice2transaction.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author mahmutkayadelen
 * @create 12.12.2021  17:42
 */
@RestController
@RequestMapping("api/transaction")
public class TransactionController {
    @Autowired
    private ITransactionService transactionService;

@PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction)
{
    return  new ResponseEntity<>(transactionService.saveTransation(transaction), HttpStatus.CREATED);
}
@DeleteMapping("{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId)
{ transactionService.deleteTransation(transactionId);
    return ResponseEntity.ok(HttpStatus.OK);
}
@GetMapping("{userId}")
public ResponseEntity<?> getAllTransactionByUserId(@PathVariable Long userId)
{
    return  ResponseEntity.ok(transactionService.findAllTransactionByUserId(userId));
}
}
