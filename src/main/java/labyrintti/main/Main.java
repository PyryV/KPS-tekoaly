package labyrintti.main;

import java.util.Scanner;
import labyrintti.ui.UI;

public class Main {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        UI ui = new UI(scanner);
        ui.kaynnista();
        
    }
}