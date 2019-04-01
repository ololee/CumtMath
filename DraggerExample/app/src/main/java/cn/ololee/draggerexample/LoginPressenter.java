package cn.ololee.draggerexample;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class LoginPressenter {

    private ICommonView iCommonView;

    @Inject
    public LoginPressenter(ICommonView iCommonView)
    {
        this.iCommonView=iCommonView;
    }

    public void login(User user)
    {
        Context context=iCommonView.getContext();
        Toast.makeText(context,"login....",Toast.LENGTH_LONG).show();
    }
}
