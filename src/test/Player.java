package test;

public class Player {
    private int id;
    private String name;
    private int salary;
    private String team;

    public Player(int id, String name, int salary, String team){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.team = team;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
