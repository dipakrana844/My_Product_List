package com.example.practical_list.Model_1.Model;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "https://api.flickr.com";

    @GET("/services/feeds/photos_public.gne?")
    Call<ProductListModel> getData(@Query("tags") String tags, @Query("tagmode") Boolean tagmode, @Query("lang") String lang,
                                   @Query("format") String format, @Query("nojsoncallback") String nojsoncallback);
}
