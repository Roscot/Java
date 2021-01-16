class Ex6Class {
    int wielkość(String s) {
        return s.length() * 2;
    }
}

public class exercise6 {
    public static void main(String[] args) {
        Ex6Class exClass = new Ex6Class();
        System.out.println(exClass.wielkość("abc"));
    }
}


