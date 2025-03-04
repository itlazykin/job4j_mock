package ru.checkdev.notification.telegram.action;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface Action {
    BotApiMethod<Message> handle(Message message);

    BotApiMethod<Message> callback(Message message);
}
