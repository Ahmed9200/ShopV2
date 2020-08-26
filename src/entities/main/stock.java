//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package entities.main;

import Database.database;
import Tools.tools;
import entities.mainFunctions;

public class stock implements mainFunctions {
    private int id;
    private String name;

    public stock() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        String strInsert = "insert into stock values(" + this.id + " , '" + this.name + "' )";
        boolean isAdded = database.excuteQuery(strInsert);
        if (isAdded) {
            tools.InformationBox("تم اضافه المخزن فى قاعده البيانات بنجاح");
        } else {
            tools.ErrorBox("هنالك خطأ فى اضافه المخزن");
        }

    }

    public void update() {
        String strUpdate = "update stock set name = '" + this.name + "'  \n where id =" + this.id;
        boolean isUpdated = database.excuteQuery(strUpdate);
        if (isUpdated) {
            tools.InformationBox("تم تعديل المخزن فى قاعده البيانات بنجاح");
        } else {
            tools.ErrorBox("هنالك خطأ فى التعديل على المخزن");
        }

    }

    public void delete() {
        String strDelete = "delete from stock where id = " + this.id;
        boolean isDeleted = database.excuteQuery(strDelete);
        if (isDeleted) {
            tools.InformationBox("تم مسح المخزن فى قاعده البيانات بنجاح");
        } else {
            tools.ErrorBox("هنالك خطأ فى مسح المخزن");
        }

    }

    public String getAutoNumber() {
        String strAuto = database.AutoIncrementCoulmn("stock", "id");
        return strAuto;
    }
}