package two.one.drawer.web;


import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import two.one.drawer.entities.User;


public interface LoginController {
    @FormUrlEncoded
    @POST("/login")
    Call<User> login(@Field("username") String user, @Field("password") String pwd);


    @POST("logout")
    void logout();
}
