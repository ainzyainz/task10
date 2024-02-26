import entity.Address;
import entity.HomeTask;
import entity.WorkTask;

public class MockUtils {
    public static Address getAddress() {
        Address address = Address.builder()
                .city("1")
                .street("1")
                .build();

        return address;
    }

    public static HomeTask getHomeTask() {
        Address tempAddress = getAddress();
        HomeTask homeTask = new HomeTask();

        homeTask.setName("1");
        homeTask.setDescription("1");
        homeTask.setAddress(tempAddress);

        return homeTask;

    }

    public static WorkTask getWorkTask() {

        WorkTask workTask = new WorkTask();
        workTask.setName("2");
        workTask.setDescription("2");
        workTask.setCost(13);

        return workTask;
    }
}
