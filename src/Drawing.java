public class Drawing {
    private static Drawing instance;

    private Drawing() {}

    public static Drawing getInstance() {
        if (instance == null) {
            instance = new Drawing();
        }
        return instance;
    }

    public void drawShape(Shape shape) {
        String shapeType;
        if (shape instanceof Square) {
            shapeType = "Square";
        } else if (shape instanceof Circle) {
            shapeType = "Circle";
        } else {
            shapeType = "Unknown Shape";
        }

        System.out.println("Drawing a " + shapeType +
                           " with color: " + shape.getColor() +
                           " and area: " + shape.calculateArea());
    }
}
