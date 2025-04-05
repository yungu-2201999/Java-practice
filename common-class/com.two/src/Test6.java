public class Test6 {
    public static void main(String[] args) {
        ShowMsg showMsg = new ShowMsg();
        Generic<Integer> generic = new Generic<>();
        generic.setFlag(20);
        showMsg.showFlag(generic);

        Generic<String> generic2 = new Generic<>();
        generic2.setFlag("old");
        showMsg.showFlag(generic2);

    }
}
