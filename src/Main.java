import utils.LoadData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exec - LoadData Class");
        new Thread(() -> {
            LoadData load = new LoadData();
            load.loadProviders();
            System.out.println("Data Loaded");
        }).start();

        // Go to respective interface (POV)
        System.out.println("Select a Role");
    }
}