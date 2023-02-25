package com.rest.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
/**
 * Used to store information about ticket.
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private Long id;
    private User user;
    private PurchasedSeat purchasedSeat;
    private Timestamp purchaseDate;
}
