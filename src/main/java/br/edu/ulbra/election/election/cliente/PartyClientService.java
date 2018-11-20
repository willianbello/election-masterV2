package br.edu.ulbra.election.election.cliente;

import br.edu.ulbra.election.election.output.v1.PartyOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PartyClientService {

    @FeignClient(value="party-service", url="$http://localhost:8080")
    private interface PartyClient {
        @GetMapping("/v1/party/{partyId}")
        PartyOutput getById(@PathVariable(name = "partyId") Long partyId);
    }
}
