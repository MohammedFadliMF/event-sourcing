package org.sid.event_driven_axon.commands.controllers;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.sid.event_driven_axon.commonapi.commands.CreateAccountCommand;
import org.sid.event_driven_axon.commonapi.dtos.CreateAcountRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands/account")
public class AccountCommandController {
    private CommandGateway commandGateway;

    public AccountCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/create")
    public  CompletableFuture<String> createNewAccount(@RequestBody CreateAcountRequestDTO req){
        return commandGateway.send(new CreateAccountCommand(
                UUID.randomUUID().toString(),
                req.getCurrency(),
                req.getInitialBalance()
        ));
    }
}
