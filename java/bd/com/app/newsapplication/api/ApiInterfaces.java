package bd.com.app.newsapplication.api;

import bd.com.app.newsapplication.model.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterfaces {
    @GET("top-headlines")
    Call<News> getNews(
            @Query("country") String country,
            @Query("apikey") String apikey
    );


}
