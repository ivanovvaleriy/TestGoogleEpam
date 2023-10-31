package utils;

public class UserModel {
    public int id;
    public String firstname;
    public String lastname;
    public String collect;


    public String user0(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = "Pavlo";
        this.lastname = lastname;


        return firstname;
    }

    public String user1() {

        this.firstname = "Valerii";
        return firstname;
    }

    public String user2() {

        this.firstname = "111";
        return firstname;
    }

    public String user3() {

        this.firstname = "G";
        return firstname;
    }
public String user4() {

        this.firstname = "Валерий";
        return firstname;
    }
public String user5() {

        this.firstname = "ValeriiValeriiValeriiValeriiValeriiValerii";
        return firstname;
    }
    public String user6() {

        this.firstname = "ValeriiVvvValeriiVvvValeriiVvv";
        return firstname;
    }


    public String user7() {

        this.firstname = "";
        return firstname;
    }
    public String user8() {

        this.firstname = " ";
        return firstname;
    }

    public String user9() {

        this.firstname = "Valerii Valerii";
        return firstname;
    }
public String user10() {

        this.firstname = "ValeriiValerii ";
        return firstname;
    }

public String user11() {

        this.firstname = " ValeriiValerii";
        return firstname;
    }

    public String user12() {

        this.firstname = "<body>";
        return firstname;
    }

    public String user33() {
        this.id = 12;
        this.firstname = "Petro";
        this.lastname = "Zibrov";
        this.collect = id + firstname + lastname;

        return collect;
    }


    @Override
    public String toString() {
        return "user1(" +
                "id=" +
                ", firstname='" + firstname + '\'' +
                '}';
    }


}
