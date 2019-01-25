package cz.mirek.redis.redistest.domain;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
public class Student implements Serializable {

    public enum Gender {
        MALE, FEMALE
    }

    public String id;
    public String name;
    public Gender gender;
    public int grade;
}