package com.ttg.bean;

public class MUser {
    private int no;
    private String name;
    private Integer age;
    private String url;
    private Integer status;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MUser mUser = (MUser) o;

        if (no != mUser.no) return false;
        if (name != null ? !name.equals(mUser.name) : mUser.name != null) return false;
        if (age != null ? !age.equals(mUser.age) : mUser.age != null) return false;
        if (url != null ? !url.equals(mUser.url) : mUser.url != null) return false;
        if (status != null ? !status.equals(mUser.status) : mUser.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = no;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MUser{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", url='" + url + '\'' +
                ", status=" + status +
                '}';
    }
}
