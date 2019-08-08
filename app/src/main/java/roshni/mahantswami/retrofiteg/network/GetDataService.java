package roshni.mahantswami.retrofiteg.network;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import roshni.mahantswami.retrofiteg.model.RetroPhoto;

public interface GetDataService
{
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
