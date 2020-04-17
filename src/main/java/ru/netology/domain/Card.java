package ru.netology.domain;

public class Card {
    private int cartId;
    private String cartUrl;
    private String title;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCartUrl() {
        return cartUrl;
    }

    public void setCartUrl(String cartUrl) {
        this.cartUrl = cartUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
