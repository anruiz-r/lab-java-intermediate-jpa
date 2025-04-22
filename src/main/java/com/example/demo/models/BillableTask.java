package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("BillableTask")

public class BillableTask extends Task{
    @Column(name = "hourly_rate")
    private BigDecimal hourlyRate;

    public BillableTask() {

    }

    public BillableTask(String title, String dueDate, boolean status, BigDecimal hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "BillableTask{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}
