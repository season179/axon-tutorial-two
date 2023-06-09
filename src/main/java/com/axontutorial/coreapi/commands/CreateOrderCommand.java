package com.axontutorial.coreapi.commands;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Objects;

@Data
public class CreateOrderCommand {

    // The TargetAggregateIdentifier annotation tells Axon that the annotated field is an id of a given aggregate to which the command should be targeted.
    @TargetAggregateIdentifier
    private final String orderId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateOrderCommand that = (CreateOrderCommand) o;
        return Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "CreateOrderCommand{" + "orderId='" + orderId + '\'' + '}';
    }
}
