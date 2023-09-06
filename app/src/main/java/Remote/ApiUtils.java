package Remote;

public class ApiUtils {

    public static final String BASE_URL = "https://vserveq.voltasworld.com/safetyapi/api/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
