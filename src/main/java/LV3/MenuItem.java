package LV3;

class MenuItem {
    private String name;
    private int price;
    private String description;

    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "이름: " + name + ", 가격: " + price + "원, 설명: " + description;
    }
}
