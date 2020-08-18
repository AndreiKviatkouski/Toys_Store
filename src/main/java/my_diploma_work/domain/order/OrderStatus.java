package my_diploma_work.domain.order;

public enum OrderStatus {
    PROCESSED, // обрабатывается
    WAITING_FOR_PAYMENT, // ожидание оплаты
    ORDERED, // заказано
    DELIVERED, // доставляется
    DONE // доставлено
}
