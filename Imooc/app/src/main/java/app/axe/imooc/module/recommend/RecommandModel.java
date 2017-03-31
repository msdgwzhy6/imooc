package app.axe.imooc.module.recommend;


import java.util.ArrayList;

import app.axe.imooc.module.BaseModel;

/**
 * *******************************************************
 *
 * @文件名称：RecommandModel.java
 * @文件作者：renzhiqiang
 * @创建时间：2015年7月9日 上午9:24:04
 * @文件描述：产品实体
 * @修改历史：2015年7月9日创建初始版本 ********************************************************
 */
public class RecommandModel extends BaseModel {

    public ArrayList<RecommandBodyValue> list;
    public RecommandHeadValue head;

    public ArrayList<RecommandBodyValue> getList() {
        return list;
    }

    public void setList(ArrayList<RecommandBodyValue> list) {
        this.list = list;
    }

    public RecommandHeadValue getHead() {
        return head;
    }

    public void setHead(RecommandHeadValue head) {
        this.head = head;
    }
}
