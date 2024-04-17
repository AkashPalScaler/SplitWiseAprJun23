package com.example.splitwise.Strategies;

import com.example.splitwise.Dtos.Transaction;

import java.util.List;
import java.util.Map;

public interface SettleUpStrategy {
    List<Transaction> settleUpGroup(Map<Long, Integer> map);
}
