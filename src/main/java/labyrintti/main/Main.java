package labyrintti.main;

import java.util.Scanner;

import labyrintti.domain.Labyrintinluoja;
import labyrintti.ui.UI;

public class Main {
    public static void main(String[] args) {
        
        Labyrintinluoja luoja = new Labyrintinluoja();
        Scanner scanner = new Scanner(System.in);
        UI ui = new UI(scanner);
        ui.kaynnista();
    }
}