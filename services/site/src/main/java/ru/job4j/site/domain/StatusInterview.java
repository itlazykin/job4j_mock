package ru.job4j.site.domain;

public enum StatusInterview {
    IS_UNKNOWN(0, "Неизвестен"),

    IS_NEW(1, "Новое"),

    IN_PROGRESS(2, "В процессе"),

    IS_FEEDBACK(3, "Ожидает отзыв"),

    IS_COMPLETED(4, "Завершено"),

    IS_CANCELED(5, "Отменено");

    private final int id;
    private final String info;

    StatusInterview(int id, String info) {
        this.id = id;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }
}
