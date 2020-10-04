package builder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GeneralMail implements Serializable {

    private String from;
    private String to;
    private String subject;
    private String textMessage;
    private List<String> cc;
    private List<String> bcc;
    private MailSeverity mailSeverity = MailSeverity.NORMAL;

    private GeneralMail () {};

    public static class Builder{

        public enum STANDART_FLOW {
            CREATE;

            private GeneralMail generalMailInfo;
            public class StandartFlowSteps{
                public StandartFlowSteps addAllCc(List<String> cc) {
                    generalMailInfo.cc = cc;
                    return this;
                }
                public StandartFlowSteps addAllBcc(List<String> bcc) {
                    generalMailInfo.bcc.addAll(bcc);
                    return this;
                }
                public StandartFlowSteps addCc(String ccItem) {
                    if(generalMailInfo.cc == null){
                        generalMailInfo.cc = new ArrayList<String>();
                    }
                    generalMailInfo.cc.add(ccItem);
                    return this;
                }
                public StandartFlowSteps addBcc(String bccItem) {
                    if(generalMailInfo.bcc == null){
                        generalMailInfo.bcc = new ArrayList<String>();
                    }
                    generalMailInfo.bcc.add(bccItem);
                    return this;
                }
                public StandartFlowSteps wihMailSeverity(MailSeverity mailSeverity) {
                    generalMailInfo.mailSeverity = mailSeverity;
                    return this;
                }
                public GeneralMail build(){
                    // extra mandatory fields check
                    return generalMailInfo;
                }
            }
            public StandartFlowSteps mandatory(String from, String to, String subject, String textMessage){
                generalMailInfo = new GeneralMail();
                generalMailInfo.from = from;
                generalMailInfo.to = to;
                generalMailInfo.subject = subject;
                generalMailInfo.textMessage = textMessage;
                StandartFlowSteps steps = new StandartFlowSteps();
                return steps;
            }

            public GeneralMail build(){
                return generalMailInfo;
            }

        };
        public enum MANAGER_FLOW{
            CREATE;
            private GeneralMail generalMailInfo;
            public class ManagerFlowSteps{
                public MANAGER_FLOW.ManagerFlowSteps addAllBcc(List<String> bcc) {
                    generalMailInfo.bcc.addAll(bcc);
                    return this;
                }
                public MANAGER_FLOW.ManagerFlowSteps addCc(String ccItem) {
                    if(generalMailInfo.cc == null){
                        generalMailInfo.cc = new ArrayList<String>();
                    }
                    generalMailInfo.cc.add(ccItem);
                    return this;
                }
                public MANAGER_FLOW.ManagerFlowSteps addBcc(String bccItem) {
                    if(generalMailInfo.bcc == null){
                        generalMailInfo.bcc = new ArrayList<String>();
                    }
                    generalMailInfo.bcc.add(bccItem);
                    return this;
                }
                public MANAGER_FLOW.ManagerFlowSteps wihMailSeverity(MailSeverity mailSeverity) {
                    generalMailInfo.mailSeverity = mailSeverity;
                    return this;
                }
                public GeneralMail build(){
                    return generalMailInfo;
                }
            }
            public MANAGER_FLOW.ManagerFlowSteps mandatory(String from, String to, String subject, String textMessage, List<String> cc){
                generalMailInfo = new GeneralMail();
                generalMailInfo.from = from;
                generalMailInfo.to = to;
                generalMailInfo.subject = subject;
                generalMailInfo.textMessage = textMessage;
                generalMailInfo.cc = cc;
                MANAGER_FLOW.ManagerFlowSteps steps = new MANAGER_FLOW.ManagerFlowSteps();
                return steps;
            }
        };
        public enum PRIVATE_MANAGER_FLOW{
            CREATE;
            private GeneralMail generalMailInfo;
            public class PrivateManagerFlowSteps{
                public PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps addAllCc(List<String> cc) {
                    generalMailInfo.cc = cc;
                    return this;
                }
                public PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps addCc(String ccItem) {
                    if(generalMailInfo.cc == null){
                        generalMailInfo.cc = new ArrayList<String>();
                    }
                    generalMailInfo.cc.add(ccItem);
                    return this;
                }
                public PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps addBcc(String bccItem) {
                    if(generalMailInfo.bcc == null){
                        generalMailInfo.bcc = new ArrayList<String>();
                    }
                    generalMailInfo.bcc.add(bccItem);
                    return this;
                }
                public PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps wihMailSeverity(MailSeverity mailSeverity) {
                    generalMailInfo.mailSeverity = mailSeverity;
                    return this;
                }
                public GeneralMail build(){
                    return generalMailInfo;
                }
            }
            public PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps mandatory(String from, String to, String subject, String textMessage, List<String> bcc){
                generalMailInfo = new GeneralMail();
                generalMailInfo.from = from;
                generalMailInfo.to = to;
                generalMailInfo.subject = subject;
                generalMailInfo.textMessage = textMessage;
                generalMailInfo.bcc = bcc;
                PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps steps = new PRIVATE_MANAGER_FLOW.PrivateManagerFlowSteps();
                return steps;

            }
        };
    }
    public enum MailSeverity{
        NORMAL,
        IMPORTANT,
        HIGH_IMPORTANT;
    }

    @Override
    public String toString() {
        return "GeneralMailInfo{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", textMessage='" + textMessage + '\'' +
                ", cc=" + cc +
                ", bcc=" + bcc +
                ", mailSeverity=" + mailSeverity +
                '}';
    }
}

