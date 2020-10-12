package ru.mirea.lab19.ex2;

public class Head {
    private String eyeColor;
    private String shapeOfFace;
    private boolean hasAcne;

    Head(String eyeColor, String shapeOfFace, boolean hasAnce) {
        this.eyeColor = eyeColor;
        this.shapeOfFace = shapeOfFace;
        this.hasAcne = hasAnce;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getShapeOfFace() {
        return shapeOfFace;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHasAcne(boolean hasAcne) {
        this.hasAcne = hasAcne;
    }

    public void setShapeOfFace(String shapeOfFace) {
        this.shapeOfFace = shapeOfFace;
    }

    @Override
    public String toString() {
        return "Head{" +
                "eyeColor='" + eyeColor + '\'' +
                ", shapeOfFace='" + shapeOfFace + '\'' +
                ", hasAcne=" + hasAcne +
                '}';
    }
}
