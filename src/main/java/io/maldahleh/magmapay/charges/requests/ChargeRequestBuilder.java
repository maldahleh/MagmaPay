package io.maldahleh.magmapay.charges.requests;

import io.maldahleh.magmapay.gateways.Gateway;

import org.bukkit.entity.Player;

public class ChargeRequestBuilder {
    private ChargeRequest chargeRequest;

    public ChargeRequestBuilder(Player player, Gateway gateway, double amountToCharge, String isoCurrency) {
        chargeRequest = new ChargeRequest(player, gateway, amountToCharge, isoCurrency);
    }

    public ChargeRequestBuilder setChargeImmediately(boolean chargeImmediately) {
        chargeRequest.setChargeImmediately(chargeImmediately);
        return this;
    }

    public ChargeRequestBuilder setChargeDescription(String chargeDescription) {
        chargeRequest.setChargeDescription(chargeDescription);
        return this;
    }

    public ChargeRequestBuilder setStatementDescriptor(String statementDescriptor) {
        chargeRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    public ChargeRequestBuilder setProvidedPin(String providedPin) {
        chargeRequest.setProvidedPin(providedPin);
        return this;
    }

    public ChargeRequest buildRequest() {
        return chargeRequest;
    }
}