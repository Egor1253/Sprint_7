package edu.praktikum.sprint7.courier.constant;

public enum ScooterApiEndpoints {

    BASE_URL("http://qa-scooter.praktikum-services.ru/"),
    COURIER_POST_LOGIN("/api/v1/courier/login"),
    COURIER_POST_CREATE("/api/v1/courier"),
    COURIER_DELETE("/api/v1/courier/:id"),
    COURIER_GET_ORDERS_COUNT("/api/v1/courier/:id/ordersCount"),
    ORDER_PUT_FINISH("/api/v1/orders/finish/:id"),
    ORDER_PUT_CANCEL("/api/v1/orders/cancel"),
    ORDER_GET_LIST("/api/v1/orders"),
    ORDER_GET_BY_NUMBER("/api/v1/orders/track"),
    ORDER_PUT_ACCEPT("/api/v1/orders/accept/:id"),
    ORDER_POST_CREATE("/api/v1/orders"),
    UTILS_GET_PING("/api/v1/ping"),
    UTILS_GET_STATION("/api/v1/stations/search");

    private final String url;

    ScooterApiEndpoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

