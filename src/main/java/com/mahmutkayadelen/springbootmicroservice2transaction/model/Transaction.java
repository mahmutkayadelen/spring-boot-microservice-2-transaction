package com.mahmutkayadelen.springbootmicroservice2transaction.model;

import lombok.Cleanup;
import lombok.Data;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @Author mahmutkayadelen
 * @create 12.12.2021  17:18
 */
@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "product_id",nullable = false)
    private Long productId;
    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;



}
