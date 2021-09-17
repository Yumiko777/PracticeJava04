// StudentCardクラスで宣言されているインスタンス変数id name、およびprintInfoメソッドをIStudentCardクラスのインスタンスでも使用できる
public class InheritanceExample {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();
        // 変数id nameはStudentCardクラスで宣言されているが、IStudentCardクラスの変数として扱える。
        a.id = 2345;
        a.name = "John";
        a.nationality = "イギリス";
        a.printInfo();
    }  
}
