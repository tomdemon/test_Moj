public class Person {

    static int ileLudzi;

    String name;
    int age;
    boolean imAlive;
    boolean work;

    void przedstawSie(boolean formal) {

        if (formal) {
            System.out.println ("Witam Państwa. Mam na imię " + name + " i mam " + age + " lat.");
        } else {
            System.out.println ("Cześć jestem " + name + " i mam " + age + " lat.");
        }
        ileLudzi++;
    }

    static int iluLudziSiePrzedstawilo(){
        return ileLudzi;
    }

}