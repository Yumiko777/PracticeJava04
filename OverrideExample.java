public class OverrideExample {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木";
        // StudentCardクラスのインスタンスに対してprintInfoメソッドを呼び出している
        a.printInfo();

        IStudentCard b = new IStudentCard();
        b.id = 2345;
        b.name = "John";
        b.nationality = "イギリス";
        // IStudentCardクラスのインスタンスに対してprintInfoメソッドを呼び出している
        b.printInfo();
    }  
}
