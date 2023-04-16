package week1.ch08;

public class Order {
    String orderNumber;
    String phoneNumber;
    String address;
    String orderDate;
    String orderTime;
    int orderPrice;
    int menuNumber;

    public Order(){}
    public Order(String orderNumber, String phoneNumber, String address, String orderDate, String orderTime, int orderPrice, int menuNumber){
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
    }

    @Override
    public String toString() {
        return "주문 접수 번호 : " + orderNumber +"\n"
                +"주문 핸드폰 번호 : " + phoneNumber + "\n"
                +"주문 집 주소 : " + address + "\n"
                +"주문 날짜 : " + orderDate + "\n"
                +"주문 시간 : " + orderTime + "\n"
                +"주문 가격 : " + orderPrice + "\n"
                +"메뉴 번호 : " + menuNumber;
    }
}
