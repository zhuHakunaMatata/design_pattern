package com.my.designpattern.decorator.newlogin;

import com.my.designpattern.decorator.legacylogin.ILoginService;
import com.my.designpattern.decorator.legacylogin.ResultMsg;

public interface INewLoginService extends ILoginService {

    public ResultMsg login4QQ (String username, String password);
    public ResultMsg register4QQ (String username, String password);

    public ResultMsg login4Wechat (String username, String password);
    public ResultMsg register4Wechat (String username, String password);

}
