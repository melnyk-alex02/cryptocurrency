package org.alex.cryptocurrency.restcontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.alex.cryptocurrency.service.CryptoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CryptoController {
    private final CryptoService cryptoService;

    @GetMapping("/prices/BTCUSDT")
    public String getBTCUSDTPrice() throws JsonProcessingException {
        return "Mark price of btcusdt: " + cryptoService.getBTCUSDTPrice().getMarkPrice();
    }

    @GetMapping("/prices/ETHUSDT")
    public String getETHUSDTPrices() throws JsonProcessingException {
        return "Mark price of ethusdt: " + cryptoService.getETHUSDT().getMarkPrice();
    }
}