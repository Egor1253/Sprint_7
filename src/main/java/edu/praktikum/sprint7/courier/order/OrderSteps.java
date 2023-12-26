package edu.praktikum.sprint7.courier.order;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static edu.praktikum.sprint7.courier.constant.ScooterApiEndpoints.*;
import static io.restassured.RestAssured.given;

public class OrderSteps {

    public static RequestSpecification requestSpec() {
        return given().log().all()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URL.getUrl());
    }

    @Step("Создание заказа")
    public ValidatableResponse createNewOrder(OrderModel orderModel) {
        return requestSpec()
                .body(orderModel)
                .when()
                .post(ORDER_POST_CREATE.getUrl())
                .then();
    }

    @Step("Получение списка заказов")
    public ValidatableResponse getOrderList() {
        return requestSpec()
                .when()
                .get(ORDER_GET_LIST.getUrl())
                .then();
    }

    @Step("Отмена заказа")
    public ValidatableResponse cancelOrder(int track) {
        return requestSpec()
                .body(track)
                .when()
                .put(ORDER_PUT_CANCEL.getUrl())
                .then();
    }
}

