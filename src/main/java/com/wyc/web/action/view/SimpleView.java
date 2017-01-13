package com.wyc.web.action.view;/**
 * Created by wyc on 2017/01/13.
 */

import com.sun.media.sound.MidiOutDeviceProvider;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author wangyongcan
 * @Date 2017/01/13 17:40
 */
public class SimpleView extends AbstractView {
    private String modelPath;
    private String viewName;

    public SimpleView(String modelPath,String viewName) {
        this.modelPath = modelPath;
        this.viewName = viewName;
    }

    @Override
    protected void renderMergedOutputModel(Map<String, Object> dataMap, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String modelFilePath = request.getSession().getServletContext().getRealPath(modelPath+viewName);
        String modelContent = FileCopyUtils.copyToString(new FileReader(modelFilePath));
        for(Map.Entry<String,Object> entry : dataMap.entrySet()) {
            // 实现简单的变量替换,${key} -> value
            modelContent = modelContent.replace("${"+entry.getKey()+"}",entry.getValue().toString());
        }
        response.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println(modelContent);
    }
}
