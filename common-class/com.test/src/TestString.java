public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb2 = new StringBuffer("abc");
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
        sb.append(", I can sing my abc!");
        System.out.println(sb.toString());

        StringBuffer sb1 = new StringBuffer("cba");
        sb1.insert(0, "me ").insert(0, "love ");
        System.out.println(sb1);
        sb1.delete(0, 2);// 删除字符串
        System.out.println(sb1);
        sb1.deleteCharAt(0).deleteCharAt(0);
        System.out.println(sb1);
        System.out.println(sb1.charAt(0));
        System.out.println(sb1.reverse());
    }
}
