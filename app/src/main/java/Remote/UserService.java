package Remote;

import Model.LoginResponse;
import Model.POJO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

        @GET("User/SignIn")
        Call<LoginResponse> login(@Body POJO voltas);
}
