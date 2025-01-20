package LV4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Kiosk() {
        // 메뉴 항목 생성
        List<MenuItem> burgerItems = new ArrayList<>();
        burgerItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        List<MenuItem> drinkItems = new ArrayList<>();
        drinkItems.add(new MenuItem("Coke", 2.0, "콜라"));
        drinkItems.add(new MenuItem("Sprite", 1.8, "스프라이트"));
        drinkItems.add(new MenuItem("Lemonade", 2.5, "레모네이드"));

        List<MenuItem> dessertItems = new ArrayList<>();
        dessertItems.add(new MenuItem("Ice Cream", 3.0, "바닐라 아이스크림"));
        dessertItems.add(new MenuItem("Brownie", 2.5, "초코 브라우니"));

        // 메뉴 카테고리 생성
        menus.add(new Menu("Burgers", burgerItems));
        menus.add(new Menu("Drinks", drinkItems));
        menus.add(new Menu("Desserts", dessertItems));
    }

    // Getter and Setter for menus (선택 사항, 외부에서 메뉴를 관리할 수 있도록)
    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choice > 0 && choice <= menus.size()) {
                Menu selectedMenu = menus.get(choice - 1);
                showMenuItems(selectedMenu);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    private void showMenuItems(Menu menu) {
        System.out.println("\n[" + menu.getCategoryName().toUpperCase() + " MENU ]");
        menu.showMenuItems();
        System.out.println("0. 뒤로가기");

        System.out.print("선택: ");
        int choice = scanner.nextInt();

        if (choice == 0) {
            return;
        }

        if (choice > 0 && choice <= menu.getMenuItems().size()) {
            MenuItem selectedItem = menu.getMenuItems().get(choice - 1);
            System.out.println("\n선택한 메뉴: " + selectedItem);
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
        }
    }

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}


