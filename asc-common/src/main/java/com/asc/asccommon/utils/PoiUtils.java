package com.asc.asccommon.utils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;


/**
 * Poi相关操作
 * @author changxin
 * @date 2019-10-16
 */

public class PoiUtils {

    private static  final Logger logger = (Logger) LoggerFactory.getLogger(PoiUtils.class);

    /**
     * 生成excel文件
     * @param workbook
     * @param fileName
     * @return
     */
    public static File createExcelFile(Workbook workbook,String fileName){
        OutputStream outputStream = null;
        File file=null;
        try {

            file = File.createTempFile(fileName,".xlsx");
            outputStream = new FileOutputStream(file.getAbsoluteFile());
            workbook.write(outputStream);
        }catch (FileNotFoundException e){
            logger.error("文件未找到",e);
        }catch (IOException e){
            logger.error("IO异常",e);
        }finally {
            IOUtils.closeQuietly(workbook);
            IOUtils.closeQuietly(outputStream);
        }
        return file;
    }
}
