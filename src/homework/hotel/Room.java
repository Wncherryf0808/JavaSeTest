package homework.hotel;

import java.util.Objects;

public class Room {
    // 房间编号
    private int id;

    // 房间类型
    private int style;

    // 房间状态（是否被预定）
    private boolean book;

    // 无参构造函数
    public Room() {
    }

    // 有参数构造函数

    public Room(int id, int style, boolean book) {
        this.id = id;
        this.style = style;
        this.book = book;
    }

    // setter and getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public boolean isBook() {
        return book;
    }

    public void setBook(boolean book) {
        this.book = book;
    }

    // 重写equals，用于判断房间是否是同一个房间
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id;
    }

    // 重写toString()
    @Override
    public String toString() {
        return "Room{" +
                "房间号:" + id +
                ", 房间类型:" + style +
                ", 是否被预定:" + book +
                '}';
    }

    //
}
