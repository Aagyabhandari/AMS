package model;

public class Attendance {

    private final int id;
    private final int classId;
    private final int userId;

    public Attendance(int id, int classId, int userId) {
        this.id = id;
        this.classId = classId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public int getClassId() {
        return classId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUser_id() {
        return getUser_id();
    }

    public String getClass_id() {
        return getClass_id();
    }
    public String getId() {
        return getId() ;
    }
}


