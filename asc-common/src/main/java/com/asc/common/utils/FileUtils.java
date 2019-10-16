package com.asc.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 文件相关操作
 * @author changxin
 * @date 2019-10-16
 */
public class FileUtils {
    private final static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    public static void downloadFile(HttpServletResponse response, File file, String newFileName){
       try{
           response.setHeader("Content-Disposition","attachment;filename="+new String(newFileName.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8));
           BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
           InputStream inputStream = new FileInputStream(file.getAbsolutePath());
           BufferedInputStream bis = new BufferedInputStream(inputStream);
           int length = 0;
           byte[] temp = new byte[1*1024*10];
           while((length=bis.read(temp))!=-1){
               bos.write(temp,0,length);
           }
           bos.flush();
           bis.close();
           bos.close();
           inputStream.close();
       }catch (Exception e){
           logger.error("下载文件异常",e);
       }

    }
}
