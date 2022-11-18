package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Instalment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");

	private LocalDate dueDate;
	private Double amount;
	
	public Instalment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
}
