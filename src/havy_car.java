import com.company.type_car;

public class havy_car extends type_car {

    int max_speed;
    int height = 355;
    float weight = 150.5f;

    public havy_car(int height, String model, String marka, int max_speed, float weight) {
        super(height,weight);

        this.max_speed = max_speed;
        this.height = height;
        this.max_weight = max_weight;

    }
}
