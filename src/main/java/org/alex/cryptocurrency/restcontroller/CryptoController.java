package org.alex.cryptocurrency.restcontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.alex.cryptocurrency.responses.MarkPriceResponse;
import org.alex.cryptocurrency.service.CryptoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CryptoController {
    private final CryptoService cryptoService;

    @GetMapping("/prices/BTCUSDT")
    public BigDecimal getBTCUSDTPrice() throws JsonProcessingException {
        return cryptoService.getBTCUSDTPrice().getMarkPrice();
    }

    @GetMapping("/prices/ETHUSDT")
    public BigDecimal getETHUSDTPrices() throws JsonProcessingException {
        return cryptoService.getETHUSDT().getMarkPrice();
    }
}