package LV3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 메뉴 리스트 생성 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("치즈버거", 5000, "고소한 치즈가 듬뿍 들어간 버거"));
        menuItems.add(new MenuItem("불고기버거", 5500, "달콤한 불고기 소스가 특징인 버거"));
        menuItems.add(new MenuItem("치킨버거", 6000, "바삭한 치킨 패티가 들어간 버거"));

        // Kiosk 객체 생성 후 메뉴 시작
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();  // start() 메서드를 호출하여 키오스크 프로그램 실행
    }
}
