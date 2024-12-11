package midTermPreparation;
class TowerOfHanoi {

    // Recursive function to solve the Tower of Hanoi problem with 5 towers
    public static void solve(int n, int fromTower, int toTower, int auxTower1, int auxTower2, int auxTower3) {
        // Base case: If only one disc, move it directly from the source to the destination
        if (n == 1) {
            System.out.println("Move disc 1 from tower " + fromTower + " to tower " + toTower);
            return;
        }

        // Move n-1 discs from the source to an auxiliary tower using the other towers
        solve(n - 1, fromTower, auxTower1, auxTower2, auxTower3, toTower);

        // Move the nth disc from the source to the destination tower
        System.out.println("Move disc " + n + " from tower " + fromTower + " to tower " + toTower);

        // Move the n-1 discs from the auxiliary tower to the destination tower
        solve(n - 1, auxTower1, toTower, fromTower, auxTower2, auxTower3);
    }

    public static void main(String[] args) {
        int n = 3; // Number of discs
        int fromTower = 1;
        int toTower = 5;
        int auxTower1 = 2;
        int auxTower2 = 3;
        int auxTower3 = 4;

        System.out.println("Moves to solve Tower of Hanoi with " + n + " discs and 5 towers:");
        solve(n, fromTower, toTower, auxTower1, auxTower2, auxTower3);
    }
}
