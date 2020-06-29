package com.cody.prototype;

public class Main {

    private static int MAX_COUNT = 6;

    public static void sendMail(Mail mail) {
        System.out.println("title: " + mail.getSubject() + "\t收件人" + mail.getReceiver() + "\t发送成功。。。。。。");
    }

    public static void main(String[] args) {
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxxx银行版权所有");

        for (int i = 0; i < MAX_COUNT; i++) {
            Mail cloneMail = mail.clone();  // 使用原型模式实现, 可以使用多个线程来发送邮件, 如果只是普通的模式会存在线程安全问题
            cloneMail.setAppellation("先生（女士）");
            cloneMail.setReceiver("zhangsan" + i);
            sendMail(cloneMail);
        }
    }
}
