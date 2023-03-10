package homework.hotel;

// 用户管理员类
public class Master {
    private Room[][] rooms;

    // 无参构造函数
    public Master() {
    }

    // 有参构造函数

    public Master(Room[][] rooms) {
        this.rooms = rooms;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    // 预定房间方法
    public void bookRoom(){

    }

    // 退订房间方法
    public void unsubscribeRoom(){
        }
}
