package cn.sourcecodes.chatterClient.controller.chatter;

import cn.sourcecodes.chatterClient.app.ApplicationContext;
import cn.sourcecodes.chatterClient.controller.Controller;

/**
 * Created by cn.sourcecodes on 2017/6/8.
 */
public class ChatterController implements Controller {
    private ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void index() {

    }
    public void hello() {}
}
