package homeworkjoker;

public class Person {
    String name;
    Person[] friends;

    Person(String name, int friendsCount) {
        this.name = name;
        this.friends = new Person[friendsCount];
    }

    void addFriend(Person friendCandidate) {
        for (int i = 0; i < this.friends.length; i++) {
            if(this.friends[i] == null) {
                this.friends[i] = friendCandidate;
                System.out.println(this.name + " became friend with: " + friendCandidate.name);
                return;
            }
        }

        System.out.println(this.name + " has no more room for friends, the limit is: " + this.friends.length);
    }
}
