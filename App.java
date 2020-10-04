package App;

import builder.GeneralMail;

import java.util.ArrayList;

public class App {

    public static  void main(String args []){
       // GeneralMail.Builder.STANDART_FLOW.CREATE.addAllBcc(null).wihMailSeverity(GeneralMail.MailSeverity.NORMAL).build();
        GeneralMail standart = GeneralMail.Builder.STANDART_FLOW.CREATE.mandatory("tayfun.dogan@etiya.com", "asli.kocak@eetiya.com", "Builder Design Pattern In Java", "COMPLETE").wihMailSeverity(GeneralMail.MailSeverity.NORMAL).build();
        GeneralMail manager = GeneralMail.Builder.MANAGER_FLOW.CREATE.mandatory("tayfun.dogan@etiya.com", "ertugrul.coskun@etiya.com", "Builder Design Pattern In Java", "COMPLETE", new ArrayList<String>()).wihMailSeverity(GeneralMail.MailSeverity.IMPORTANT).build();
        GeneralMail privateManager = GeneralMail.Builder.PRIVATE_MANAGER_FLOW.CREATE.mandatory("tayfun.dogan@etiya.com", "bulent.gurer@etiya.com", "Builder Design Pattern In Java", "COMPLETE", new ArrayList<String>()).wihMailSeverity(GeneralMail.MailSeverity.HIGH_IMPORTANT).build();

        System.out.println(standart);
        System.out.println(manager);
        System.out.println(privateManager);

    }
}
