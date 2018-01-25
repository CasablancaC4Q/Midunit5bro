package comli.example.c4q.midunit5;

import comli.example.c4q.midunit5.models.Users;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 1/24/18.
 */

public interface Network {
    @GET("?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<Users> getUserList();
}
