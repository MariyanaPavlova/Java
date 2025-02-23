package homeworkjoker;

public class PersonDemo {
    public static void main(String[] args) {
        Person gergana = new Person("Gergana Hristeva", 2);
        Person zhu = new Person("Zhulian Iliev", 4);

        Person borislav = new Person("Borislav Hristov", 6);
        Person ivan = new Person("Ivan Ivanov", 6);



        gergana.addFriend(zhu);
        gergana.addFriend(borislav);
        gergana.addFriend(gergana);
        gergana.addFriend(ivan);

        zhu.addFriend(gergana);
        zhu.addFriend(borislav);
        zhu.addFriend(ivan);
        zhu.addFriend(zhu);
        zhu.addFriend(zhu);

    }
}
