package com.asc.backup.service;

public interface MysqlBackupService {
    /**
     *备份数据库
     * @param host 数据库地址
     * @param username 数据库用户名
     * @param password 数据库密码
     * @param backupFolderPath 备份的路径
     * @param fileName 备份文件名
     * @param database 需要备份的数据库的名称
     * @return
     * @throws Exception
     */
    boolean backup(String host,String username,String password,String backupFolderPath,String fileName,String database) throws Exception;

    /**
     * 恢复数据库
     * @param restoreFilePath 数据库备份脚本地址
     * @param host 数据库ip地址
     * @param userName 数据库名字
     * @param password 数据库密码
     * @param database 数据库名称
     * @return
     * @throws Exception
     */
    boolean restore(String restoreFilePath,String host,String userName,String password,String database)throws Exception;

}
