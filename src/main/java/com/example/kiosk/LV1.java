package com.example.kiosk;
import java.util.Scanner;

public class LV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");
            System.out.print("메뉴를 선택하세요: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return; // 프로그램 종료
                case 1:
                    System.out.println("ShackBurger를 선택하셨습니다!");
                    break;
                case 2:
                    System.out.println("SmokeShack를 선택하셨습니다!");
                    break;
                case 3:
                    System.out.println("Cheeseburger를 선택하셨습니다!");
                    break;
                case 4:
                    System.out.println("Hamburger를 선택하셨습니다!");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            System.out.println();
        }
    }
}