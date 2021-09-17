public class IStudentCard extends StudentCard {
    String nationality;

    // StudentCardクラスにも含まれる、printInfoメソッドを宣言
    void printInfo() {
        // StudentCardクラスに宣言されているprintInfoメソッドを実行
        super.printInfo();
        System.out.println("国籍:" + this.nationality);
    }
}