import com.company.car;

public class havy_car extends car {

    int max_speed;
    int height = 355;
    float weight = 150.5f;

    public havy_car(int height, char model, char marka, int max_speed, float weight) {
        super(marka,model);
        this.max_speed = max_speed;
        this.height = height;
        this.weight = weight;

    }
}
