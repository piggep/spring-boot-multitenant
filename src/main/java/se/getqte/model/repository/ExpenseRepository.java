package se.getqte.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.getqte.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
