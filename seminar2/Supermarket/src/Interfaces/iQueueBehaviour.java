package Interfaces;

public interface iQueueBehaviour {
    /**
     * метод фиксирует клиента в очереди
     * @param actor клиент
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * метод, фиксирует выход из очереди
     */
    void releaseFromQueue();

    /**
     * метод взятия заказа
     */
    void takeOrder();

    /**
     * метод получения заказа
     */
    void giveOrder();
}
