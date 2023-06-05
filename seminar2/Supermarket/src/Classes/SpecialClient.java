package Classes;

public class SpecialClient extends Actor{
    private int idVIP;

    /**
     * a new VIP client
     * @param name name
     * @param idVIP id number of VIP client
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    public int getId() {
        return idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
    * чекер - заказ получен/не получен
    * @return
    */
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    /**
    * чекер - заказ сделан/не сделан
    * @return
    */
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    /**
    *  сетер заказ сделан/не сделан
    * @param makeOder устанавливает что клиент сделал заказ
    */
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }

     /**
    *  сетер заказ получен/не получен
    * @param makeOder устанавливает что заказ получен
    */
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

     /**
     * метод возвращает сам себя
     * @return объект типа Actor
     */   
    public Actor getActor() {
      return this;
    }
}
