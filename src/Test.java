class Base {
    public void test() {
    }
}

class Base1 extends Base {
    public void test() {
        System.out.println("Base1");
    }
}

class Base2 extends Base {
    public void test() {
        System.out.println("Base2");
    }
}

class Test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2= "abc";
        boolean isEqual = true;
       if(s1.length() == s2.length()){
           for (int i = 0; i < s1.length(); i++) {
               if(s1.charAt(i) != s2.charAt(i)){
                   isEqual = false;
               }
           }
       } else {
           isEqual = false;
       }
        System.out.println(isEqual);
    }
}
