package com.wyc.web.action.view;/**
 * Created by wyc on 2017/01/13.
 */

import org.springframework.cache.interceptor.CacheOperationInvocationContext;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractCachingViewResolver;

import java.io.FileReader;
import java.util.Collection;
import java.util.Locale;

/**
 * view匹配类，检查给出的viewName是否匹配
 * @author wangyongcan
 * @Date 2017/01/13 17:38
 */
public class SimpleViewResolver extends AbstractCachingViewResolver {
    // 匹配后缀
    private String suffix;

    // 模板文件地址
    private String modelPath;

    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {
        if(viewName.endsWith(getSuffix())) {
            return new SimpleView(getModelPath(),viewName);
        }
        return null;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }
}

