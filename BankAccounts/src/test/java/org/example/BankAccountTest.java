package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testBankAccount() {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccount(0001, "lia", 200000);
        bankAccount1.deposit(800000);
        bankAccount1.withdraw(400000);
        bankAccount1.checkBalance();
        bankAccount1.display();
    }
}