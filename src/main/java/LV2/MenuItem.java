package LV2;

public class MenuItem {
    private String name;
    private int price;
    private String description;

    // 생성자
    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter 메서드
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
