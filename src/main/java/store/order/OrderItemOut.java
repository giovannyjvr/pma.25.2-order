package store.order;

import lombok.Builder;

@Builder
public record OrderItemOut(
    String id,
    OrderOut product,
    Integer quantity,
    Double total
) {}