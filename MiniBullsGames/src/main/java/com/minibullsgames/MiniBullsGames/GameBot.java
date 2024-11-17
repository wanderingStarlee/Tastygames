//package com.minibullsgames.MiniBullsGames;
//
//import org.telegram.telegrambots.bots.bases.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.annotations.RegisterBot;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//@RegisterBot
//public class GameBot extends TelegramLongPollingBot {
//
//    // Здесь нужно указать ваш токен и username
//    @Override
//    public String getBotToken() {
//        return "<>"; //  токен
//    }
//
//    @Override
//    public String getBotUsername() {
//        return "<>";  // имя пользователя
//    }
//
//    @Override
//    public void onUpdateReceived(Update update) {
//        // Логика обработки входящих сообщений от пользователей
//
//        // Например, если пользователь отправил команду /games <жанр>,
//        // можно извлечь жанр и вызвать сервис для получения списка игр
//    }
//}