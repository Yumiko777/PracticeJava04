public class OverrideExample2 {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();
        a.id = 2345;
        a.name = "John";
        a.nationality = "イギリス";
        // IStudentCardクラスに宣言されているprintInfoメソッドを実行
        a.printInfo();
    }   
}
