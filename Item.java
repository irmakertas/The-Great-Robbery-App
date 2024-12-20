package endsection;

public class Item {
    private String name;
    private double value;


    public Item(String name,double value) {
        this.value = value;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getValue(){
        return value;
    }
}
