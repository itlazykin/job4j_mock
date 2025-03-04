package ru.job4j.site.domain;

public enum StatusWisher {
    IS_UNKNOWN(0, "Неизвестен"),
    IS_CONSIDERED(1, "Рассматривается"),
    IS_REJECTED(2, "Отклонено"),
    IS_DISMISSED(3, "Согласовано"),
    IS_COMPLETED(4, "Завершено");

    private final int id;
    private final String info;

    StatusWisher(int id, String info) {
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
