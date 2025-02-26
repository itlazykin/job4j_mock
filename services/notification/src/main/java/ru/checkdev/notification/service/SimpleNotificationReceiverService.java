package ru.checkdev.notification.service;

import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;
import org.springframework.kafka.annotation.KafkaListener;
import ru.checkdev.notification.domain.Notify;

@Service
@Slf4j
public class SimpleNotificationReceiverService {

    @KafkaListener(topics = "notify")
    public void receiverNotification(Notify notify) {
        log.debug(notify.toString());
    }
}
