package main.java.com.tattookot.patterns.youtube.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        System.out.println();
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        System.out.println();
        reportNotifier.notifyManager("Huston, we`re had a problem here!", Priority.ASAP);
    }
}
