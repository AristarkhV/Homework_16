package mateacademy.homework.homework_13;

public class Salary implements MessageInterface<Integer>{

    private String corporation;
    private String member;
    private Integer salary;

    public Salary(String corporation, String member, Integer salary) {
        this.corporation = corporation;
        this.member = member;
        this.salary = salary;
    }


    @Override
    public String getTo() {
        return member;
    }

    @Override
    public String getFrom() {
        return corporation;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}
