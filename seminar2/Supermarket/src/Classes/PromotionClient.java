package Classes;

public class PromotionClient extends Actor {
    private int idPromoClient;
    private String nameOfPromotion;
    private static int countOfParticipants;

    /**
     * a new Promo client
     * @param name name
     * @param idPromoClient id number of client
     * @param nameOfPromotion the name of PromoAction
     */


    public PromotionClient(String name, int idPromoClient, String nameOfPromotion) {
        super(name);
        this.idPromoClient = idPromoClient;
        this.nameOfPromotion = nameOfPromotion;
    }

    /**
     * получить количество участников акции
     * @return int
     */
    public int getCountOfParticipants() {
        return countOfParticipants;
    }

    /**
     * установить количество участников акции
     * @param countOfParticipants int - счетчик
     */
    public void setCountOfParticipants(int countOfParticipants) {
        PromotionClient.countOfParticipants = countOfParticipants;
    }

    /**
     * гетер, возвращает название акции
     * @return 
     */
    public String getNameOfPromotion() {
        return nameOfPromotion;
    }

    /**
     * сетер, устанавливает название акции
     * @param nameOfPromotion
     */
    public void setNameOfPromotion(String nameOfPromotion) {
        this.nameOfPromotion = nameOfPromotion;
    }

    /**
     * гетер возвращает id клиента акции
     * @return
     */
    public int getIdPromoClient() {
        return idPromoClient;
    }

    /**
     * сетер, устанавливает id клиента акции
     * @param idPromoClient int - id номер клиента
     */
    public void setIdPromoClient(int idPromoClient) {
        this.idPromoClient = idPromoClient;
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
