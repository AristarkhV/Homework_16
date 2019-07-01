package mateacademy.homework.homework_13;

public interface MessageInterface<T> {
        public String getTo();

        public String getFrom();

        public T getContent();
}
