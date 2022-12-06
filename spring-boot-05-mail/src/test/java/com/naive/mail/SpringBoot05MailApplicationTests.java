package com.naive.mail;

import com.naive.mail.util.MailClient;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@Log
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringBoot05MailApplication.class)
class SpringBoot05MailApplicationTests {

    @Autowired
    private MailClient mailClient;

    @Test
    void contextLoads() {
        System.out.println(123);
        mailClient.sendMail("649842096@qq.com", "text mail", "<encode send>邮件来喽！");
    }

    @Test
    public void sendStringEmail() {
        // 测试文本邮件发送（无附件）
        String to = "649842096@qq.com"; // 接收邮箱地址
        String title = "文本邮件发送测试";
        String content = "文本邮件发送测试";
        mailClient.sendMail(to, title, content);
    }

    @Test
    public void sendFileEmail() {
        // 测试单个附件邮件发送
        String to = "649842096@qq.com"; // 接收邮箱地址
        String title = "温度信息附件邮件发送测试";
        String content = "温度信息附件邮件发送测试";
        File file = new File("F:\\文档\\PUA.md");
        mailClient.sendMessageCarryFile(to, title, content, file);
    }

    @Test
    public void sendFilesEmail() {
        // 测试多个附件邮件发送
        String to = "649842096@qq.com"; // 接收邮箱地址
        String title = "多个温度信息附件邮件发送测试";
        String content = "多个温度信息附件邮件发送测试";
        File[] files = new File[2];
        files[0] = new File("F:\\文档\\PUA.md");
        files[1] = new File("F:\\文档\\笔记和色彩.xmind");
        mailClient.sendMessageCarryFiles(to, title, content, files);
    }


}
