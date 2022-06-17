package at.kolleg.erplite.sharedkernel.events;

import at.kolleg.erplite.sharedkernel.responses.OrderResponse;

import java.io.Serializable;

public record OrderPaymentValidatedEvent(OrderResponse orderResponse) implements Serializable {
}
