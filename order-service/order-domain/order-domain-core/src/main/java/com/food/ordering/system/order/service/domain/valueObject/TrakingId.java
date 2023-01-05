package com.food.ordering.system.order.service.domain.valueObject;

import com.food.ordering.system.domain.valueObject.BaseId;

import java.util.UUID;

public class TrakingId extends BaseId<UUID> {
    public TrakingId(UUID value) {
        super(value);
    }
}
