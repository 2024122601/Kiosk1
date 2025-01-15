package LV3;
import java.util.List;
import java.util.Scanner;

class Kiosk {
    private List<MenuItem> menuItems;

    // 생성자: menuItems를 받음
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // 메뉴 출력 및 사용자 입력을 받는 메서드
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("----------메뉴----------");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).getName());
            }
            System.out.println("0. 프로그램 종료");
            System.out.print("원하는 메뉴의 번호를 선택하세요: ");

            // 사용자 입력 받기
            int choice = scanner.nextInt();

            // 종료 조건
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice > 0 && choice <= menuItems.size()) {
                // 유효한 메뉴 선택
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.println("선택한 메뉴: ");
                System.out.println(selectedItem);
            } else {
                // 유효하지 않은 입력
                System.out.println("올바른 번호를 입력하세요.");
            }
        }

        scanner.close();
    }
}
