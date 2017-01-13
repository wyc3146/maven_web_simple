package com.wyc.web.config;/**
 * Created by wyc on 2017/01/13.
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangyongcan
 * @Date 2017/01/13 16:30
 */
public class CommonConfig {
    private String path;

    private String initMessage;

    public CommonConfig(String path) {
        this.path = path;
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/" + path);
        Properties properties = new Properties();
        properties.load(inputStream);

        setInitMessage(properties.get("init_message").toString());

    }

    public String getInitMessage() {
        return initMessage;
    }

    public void setInitMessage(String initMessage) {
        this.initMessage = initMessage;
    }
}
