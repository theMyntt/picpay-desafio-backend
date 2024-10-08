package com.themyntt.challenges.picpay.domain.core;

import lombok.Data;

import java.util.Date;

@Data
public class AggregateRoot {
    protected Long id;
    protected Date createdAt;
    protected Date updatedAt;
}
