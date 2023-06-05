package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * сетер, установить статус заказа
     * @param makeOrder сделан/не сделан
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * сетер, установить статуз заказа
     * @param pickUpOrder забран/не забран
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * чекер, заказ сделан/нет
     * @return 
     */
    boolean isMakeOrder();

    /**
     * черек, заказ забран/нет
     * @return
     */
    boolean isTakeOrder();

    /**
     * гетер, возврат самого себя
     * @return объект типа Actor
     */
    Actor getActor();
}
