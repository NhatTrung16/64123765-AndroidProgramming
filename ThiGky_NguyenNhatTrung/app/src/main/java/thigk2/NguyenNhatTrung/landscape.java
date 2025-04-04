package thigk2.NguyenNhatTrung;

public class landscape {
    String landImageFileName, landCation, landTimeStamp; // Thêm thuộc tính thời gian

    public landscape(String landImageFileName, String landCation, String landTimeStamp) {
        this.landImageFileName = landImageFileName;
        this.landCation = landCation;
        this.landTimeStamp = landTimeStamp; // Khởi tạo thời gian
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }

    public String getLandTimeStamp() { // Getter mới cho thời gian
        return landTimeStamp;
    }

    public void setLandTimeStamp(String landTimeStamp) { // Setter mới cho thời gian
        this.landTimeStamp = landTimeStamp;
    }
}