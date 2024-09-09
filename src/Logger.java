public class Logger {
    // Единственный экземпляр класса Logger (создается при первом обращении)
    private static Logger instance;

    // Приватный конструктор для предотвращения создания новых экземпляров
    private Logger() {
        // Инициализация логгера (можно добавить сюда дополнительную логику)
        System.out.println("Logger создан!");
    }

    // Метод для получения единственного экземпляра Logger
    public static Logger getInstance() {
        if (instance == null) { // Проверка, создан ли уже экземпляр
            instance = new Logger(); // Создание нового экземпляра, если он еще не существует
        }
        return instance; // Возврат единственного экземпляра
    }

    // Метод для записи сообщения в лог
    public void log(String message) {
        System.out.println("Лог: " + message);
    }
}