package recursion;

public class Towers_of_hanoi {
    static void TowerofHanoi(int n ,char from_root, char to_root, char aux_root){
        if (n == 1){
            return;
        }
        TowerofHanoi(n-1,from_root,aux_root,to_root);
        System.out.println("Move disk " +n+" from rod " +from_root+" to rod "+to_root);
        TowerofHanoi(n-1,aux_root,to_root,from_root);
    }
    public static void main(String[] args){
        int N = 3;
        TowerofHanoi(N, 'A','C','B');
    }
}
