package two.one.drawer.web;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitSettings {
    private static Retrofit retrofit;
    private static final String BASE_URL = "http://10.0.2.2:8090/";

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit. Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
