package LV3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 메뉴 리스트 생성 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new LV3.MenuItem("핫크리스피버거", 7000, "매콤한 치킨 패티가 들어간 버거"));
        menuItems.add(new LV3.MenuItem("불고기버거", 5000, "달콤한 불고기 소스가 들어간 버거"));
        menuItems.add(new LV3.MenuItem("새우버거", 6000, "새우가 들어가 있는 버거"));

        // Kiosk 객체 생성 후 메뉴 시작
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();  // start() 메서드를 호출하여 키오스크 프로그램 실행
    }
}
