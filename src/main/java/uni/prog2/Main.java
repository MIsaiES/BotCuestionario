package uni.prog2;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uni.prog2.botTelegram.botCuestionario;
import uni.prog2.model.User;
import uni.prog2.service.UserService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import uni.prog2.botTelegram.BotRegistra;


public class Main {



    ///////////////////////
    /**
     * Explicación y ejemplo de uso básico de la estructura de datos Map en Java.
     *
     * Un Map es una colección que almacena pares clave-valor.
     * Es útil cuando necesitamos asociar valores con una clave única, como en un diccionario.
     *
     * Ejemplo: Si deseamos almacenar nombres de personas con su número de teléfono,
     * podemos usar un Map donde la clave es el nombre y el valor es el número de teléfono.
     */
    public static void explicacionUsoMap() {
        // Creación de un HashMap, que es una implementación común de Map.
        Map<String, String> phoneBook = new HashMap<>();

        // 1. Insertar elementos en el Map usando el método put.
        phoneBook.put("Alice", "123-4567");
        phoneBook.put("Bob", "987-6543");
        phoneBook.put("Charlie", "555-7890");

        // 2. Recuperar un valor a partir de una clave usando el método get.
        String bobPhoneNumber = phoneBook.get("Bob");
        System.out.println("El número de Bob es: " + bobPhoneNumber);

        // 3. Comprobar si una clave existe en el Map.
        if (phoneBook.containsKey("Alice")) {
            System.out.println("El número de Alice es: " + phoneBook.get("Alice"));
        }

        // 4. Recorrer un Map usando un bucle for-each.
        // Se pueden recorrer las claves o los valores.
        System.out.println("\nLista completa de contactos:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Número: " + entry.getValue());
        }

        // 5. Eliminar un elemento del Map.
        phoneBook.remove("Charlie");
        System.out.println("\nDespués de eliminar a Charlie, la lista es:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Número: " + entry.getValue());
        }

        // 6. Tamaño del Map (número de pares clave-valor).
        System.out.println("\nEl número total de contactos es: " + phoneBook.size());
    }

    public static void main(String[] args) {

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botCuestionario bot = new botCuestionario();


            botsApi.registerBot(bot);

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}