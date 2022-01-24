public class PositionPointer {
    //additional class to handle inserting strings in StringBuilder
    private StringBuilder builder;
    private int offset;

    public PositionPointer(StringBuilder builder, int offset){
        this.builder = builder;
        this.offset = offset;
    }

    public void insert(String string){
        builder.insert(offset,string);
    }
}
