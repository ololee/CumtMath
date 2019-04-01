package module.bmobObjects;

import cn.bmob.v3.BmobObject;

public class Category extends BmobObject {
    /**
     * 类别名称
     */
    private String name;

    /**
     * 类别解释
     */
    private String desc;
    /**
     * 类别排名
     */
    private Integer sequence;


    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Category setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Integer getSequence() {
        return sequence;
    }

    public Category setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
}
