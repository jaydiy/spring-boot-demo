/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: MailClient
 * Author:   Chris
 * Date:     2022/12/5 13:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.naive.mail.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.io.UnsupportedEncodingException;

/**
 * @author Chris
 * @date 2022/12/5
 */
@Component
@PropertySource(value = "classpath:conf/mail.properties")
@Slf4j
public class MailClient {

    @Resource
    private JavaMailSender mailSender;

    @Value("diydaniel@163.com")
    private String from;

    /**
     * 发送邮件功能
     *
     * @param to              收件人邮箱，随意，可以是@163.com，也可以是@qq.com
     * @param theme，主题，当前邮件主题
     * @param content，邮件内容    发送邮件失败会保存日志
     */
    public void sendMail(String to, String theme, String content) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            String from = "diydaniel@163.com";

            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(theme);
            helper.setText(content, true);
            //不加参数默认是文本，加上true之后支持html格式文件
            mailSender.send(helper.getMimeMessage());
        } catch (MessagingException e) {
            log.error("发送邮件失败:" + e.getMessage());
        }
    }

    /**
     * 发送带附件的邮件信息
     *
     * @param to      接收方
     * @param subject 邮件主题
     * @param content 邮件内容（发送内容）
     * @param files   文件数组 // 可发送多个附件
     */
    public void sendMessageCarryFiles(String to, String subject, String content, File[] files) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //解决附件文件名称过长乱码问题
        System.setProperty("mail.mime.splitlongparameters", "false");
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from); // 设置发送发
            helper.setTo(to); // 设置接收方
            helper.setSubject(subject); // 设置邮件主题
            helper.setText(content, true); // 设置邮件内容
            if (files != null && files.length > 0) { // 添加附件（多个）
                for (File file : files) {
                    helper.addAttachment(MimeUtility.encodeWord(file.getName(), "utf-8", "B"), file);
                }
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 发送邮件
        mailSender.send(mimeMessage);
    }

    /**
     * 发送带附件的邮件信息
     *
     * @param to      接收方
     * @param subject 邮件主题
     * @param content 邮件内容（发送内容）
     * @param file    单个文件
     */
    public void sendMessageCarryFile(String to, String subject, String content, File file) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //解决附件文件名称过长乱码问题
        System.setProperty("mail.mime.splitlongparameters", "false");
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(from); // 设置发送发
            helper.setTo(to); // 设置接收方
            helper.setSubject(subject); // 设置邮件主题
            helper.setText(content, true); // 设置邮件内容
            helper.addAttachment(MimeUtility.encodeWord(file.getName(), "utf-8", "B"), file); // 单个附件
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 发送邮件
        mailSender.send(mimeMessage);
    }
}