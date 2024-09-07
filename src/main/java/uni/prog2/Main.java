package uni.prog2;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uni.prog2.botTelegram.BotPreguntonDbDinamico;


public class Main {


    public static void main(String[] args) {

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            BotPreguntonDbDinamico bot = new BotPreguntonDbDinamico();


            botsApi.registerBot(bot);
            System.out.println("Funciona");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}