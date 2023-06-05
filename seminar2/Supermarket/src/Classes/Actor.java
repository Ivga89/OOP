package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * a new client
     * @param name name of client
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * абстрактный метод
     * @return возвращает имя клиента
     */
    abstract public String getName();

}
