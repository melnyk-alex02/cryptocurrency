package org.alex.cryptocurrency.restcontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.alex.cryptocurrency.responses.MarkPriceResponse;
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
    public MarkPriceResponse getBTCUSDTPrice() throws JsonProcessingException {
        return cryptoService.getBTCUSDTPrice();
    }

    @GetMapping("/prices/ETHUSDT")
    public MarkPriceResponse getETHUSDTPrices() throws JsonProcessingException {
        return cryptoService.getETHUSDT();
    }
}