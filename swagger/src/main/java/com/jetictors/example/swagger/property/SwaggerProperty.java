package com.jetictors.example.swagger.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Desc           :  swagger属性配置
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:44
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Component
@ConfigurationProperties(prefix = "swagger", value = "swagger")
public class SwaggerProperty {

    /**
     *  文档标题
     */
    private String title;

    /**
     * 版本号
     */
    private String version;

    /**
     * 文档说明
     */
    private String desc;

    private String termsOfServiceUrl;

    /**
     * 认证
     */
    private String license;

    /**
     * 认证地址
     */
    private String licenseUrl;


    private String basePackage;

    private String groupName;

    private String contactName;

    private String contactUrl;

    private String contactEmail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return "SwaggerProperty{" +
                "title='" + title + '\'' +
                ", version='" + version + '\'' +
                ", desc='" + desc + '\'' +
                ", termsOfServiceUrl='" + termsOfServiceUrl + '\'' +
                ", license='" + license + '\'' +
                ", licenseUrl='" + licenseUrl + '\'' +
                ", basePackage='" + basePackage + '\'' +
                ", groupName='" + groupName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactUrl='" + contactUrl + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}

