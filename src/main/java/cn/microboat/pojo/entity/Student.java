package cn.microboat.pojo.entity;

import java.time.LocalDateTime;

/**
 * @author zhouwei
 */
public class Student extends BasicEntity {

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别<br/>
     * 0 女生<br/>
     * 1 男生
     */
    private Integer gender;

    /**
     * 入学时间
     */
    private LocalDateTime admissionTime;

    public Student(String name, Integer gender, LocalDateTime admissionTime) {
        this.name = name;
        this.gender = gender;
        this.admissionTime = admissionTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDateTime getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(LocalDateTime admissionTime) {
        this.admissionTime = admissionTime;
    }
}
