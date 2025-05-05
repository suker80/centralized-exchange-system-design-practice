package org.taegyu.crypto.price.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.taegyu.crypto.price.model.PriceEventDto;
import org.taegyu.crypto.price.service.PriceEventService;
import org.taegyu.crypto.price.util.ConvertUtil;

@Component
@RequiredArgsConstructor
public class PriceEventConsumer {

    private final PriceEventService priceEventService;
    
    @KafkaListener(
            topics = "price.event",
            concurrency = "10"

    )
    public void listen(ConsumerRecord<String, String> consumerRecord) {
        PriceEventDto priceEventDto = ConvertUtil.JsonToObject(consumerRecord.value(), PriceEventDto.class);
        priceEventService.processPriceEvent(priceEventDto);
    }
}