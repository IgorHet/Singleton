public class Main {
    public static void main(String[] args) {
        // Получение экземпляра Logger с помощью метода getInstance()
        Logger logger1 = Logger.getInstance();
        logger1.log("Первое сообщение"); // Лог: Первое сообщение

        // Повторное получение экземпляра Logger (должен вернуться тот же экземпляр)
        Logger logger2 = Logger.getInstance();
        logger2.log("Второе сообщение"); // Лог: Второе сообщение

        // Проверка, что оба вызова getInstance() вернули один и тот же экземпляр
        if (logger1 == logger2) {
            System.out.println("Оба объекта logger1 и logger2 ссылаются на один и тот же экземпляр.");
        } else {
            System.out.println("Экземпляры logger1 и logger2 разные, что не должно происходить.");
        }
    }
}