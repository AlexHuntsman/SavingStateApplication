package activity.ctec.savingstateapplication.controller.model;

import android.app.Application;



/**
 * Created by ahun0442 on 10/14/15.
 */
public class AndroidSaveState extends Application
{
    private String userName;
    private boolean isTired;
    private int age;

    public AndroidSaveState()
    {
        this.userName = "default";
        this.isTired = false;
        this.age = -0;
    }

    //Getters and setters

    public String getUserName()
    {
        return userName;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getIsTired()
    {
        return isTired;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setIsTired(boolean isTired)
    {
        this.isTired = isTired;
    }
}
