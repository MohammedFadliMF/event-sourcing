package org.sid.event_driven_axon.commonapi.commands;

import lombok.Getter;

public class CreateAccountCommand extends  BaseCommand<String>{
    @Getter private String currency;
    @Getter private double initialBalance;
    public CreateAccountCommand(String id, String currency, double initialBalance) {
        super(id);
        this.currency = currency;
        this.initialBalance = initialBalance;
    }
}
