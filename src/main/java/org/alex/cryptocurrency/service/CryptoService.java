package org.alex.cryptocurrency.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.alex.cryptocurrency.responses.MarkPriceResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CryptoService {

    @Value("${binance.api.url}")
    private String binanceApiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    private final ObjectMapper objectMapper = new ObjectMapper();

    public MarkPriceResponse getBTCUSDTPrice() throws JsonProcessingException {
        return readValue(restTemplate.getForEntity(binanceApiUrl + "/fapi/v1/premiumIndex?symbol=ETHUSDT",
                String.class).getBody());
    }

    public MarkPriceResponse getETHUSDT() throws JsonProcessingException {


        return readValue(restTemplate.getForEntity(binanceApiUrl + "/fapi/v1/premiumIndex?symbol=ETHUSDT",
                String.class).getBody());
    }

    private MarkPriceResponse readValue(String response) throws JsonProcessingException {
        return objectMapper.readValue(response, MarkPriceResponse.class);
    }
}