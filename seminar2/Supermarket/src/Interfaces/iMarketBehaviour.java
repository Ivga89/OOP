package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * метод, фиксирует приход клиента в магазин
     * @param actor клиент
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * метод, фиксирует уход из магазина
     * @param actors элемент списка
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * метод, обновляет информацию
     */
    void update();    
}
