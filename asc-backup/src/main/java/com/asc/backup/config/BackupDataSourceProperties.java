package com.asc.backup.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "asc.backup.datasource")
@Data
public class BackupDataSourceProperties {

    private String host;
    private String userName;
    private String password;
    private String database;

}
