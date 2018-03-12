package com.TomaszKarman.malze;

public class Malza {

    enum Status {Live, Dead}

    private String name;
    private Integer age;
    private Status status;

    public Malza(String name, Integer age) {
        this.name = name;
        this.age = age;
        if (age > 3) {
            this.status = status.Dead;
        }
            else{
                status = Status.Live;
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Status getStatus() {
            return status;
        }
}

