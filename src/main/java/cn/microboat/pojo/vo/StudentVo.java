package cn.microboat.pojo.vo;

/**
 * @author zhouwei
 */
public class StudentVo {

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 入学时间
     */
    private String admissionTime;

    public StudentVo(String name, String gender, String admissionTime) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime;
    }
}
