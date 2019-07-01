package mateacademy.homework.homework_13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MessageInterface<T>>{
    private Map<String, List<T>> mailServiceMailBox;

    public MailService() {
        mailServiceMailBox = new HashMap<String, List<T>>() {
            @Override
            @SuppressWarnings("empty-statement")
            public List<T> get(Object key) {
                return mailServiceMailBox.put((String) key, new LinkedList<>());
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailServiceMailBox;
    }

    @Override
    public void accept(MessageInterface<T> t) {
        List list = mailServiceMailBox.get(t.getTo());
        list.add(t.getContent());
    }
}
