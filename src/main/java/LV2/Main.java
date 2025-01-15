package LV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 메뉴 리스트 생성 및 초기화
        List<MenuItem> menuItems = createMenu();

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu(menuItems);
            System.out.print("원하는 메뉴의 번호를 선택하세요: ");

            // 예외 처리
            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else if (choice > 0 && choice <= menuItems.size()) {
                    MenuItem selectedItem = menuItems.get(choice - 1);
                    System.out.println("선택한 메뉴: ");
                    System.out.println(selectedItem);
                } else {
                    System.out.println("올바른 번호를 입력하세요.");
                }
            } catch (Exception e) {
                System.out.println("유효한 숫자를 입력하세요.");
                scanner.next(); // 잘못된 입력을 처리
            }
        }

        scanner.close();
    }

    // 메뉴 생성 메서드
    private static List<MenuItem> createMenu() {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("핫크리스피버거", 7000, "매콤한 치킨 패티가 들어간 버거"));
        menuItems.add(new MenuItem("불고기버거", 5000, "달콤한 불고기 소스가 들어간 버거"));
        menuItems.add(new MenuItem("새우버거", 6000, "새우가 들어가 있는 버거"));
        return menuItems;
    }

    // 메뉴 출력 메서드
    private static void displayMenu(List<MenuItem> menuItems) {
        System.out.println("----------메뉴----------");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getName());
        }
        System.out.println("0. 프로그램 종료");
    }
}
