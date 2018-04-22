package zk.springboot.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import zk.springboot.Models.AssetMainModel;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.zkoss.zkplus.spring.SpringUtil.getApplicationContext;

public class ApiService {

    OkHttpClient client = new OkHttpClient();

    private final Gson gson = new Gson();

    public static List<AssetMainModel> getData(String url) throws Exception{
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
//        String data =  response.body().toString();
//
//        List<AssetMainModel> assetMainModel = new Gson().fromJson(response.body().charStream(), (Type) AssetMainModel.class);

//        AssetMainModel[] assetMainModelslist = new Gson().fromJson()

        final GsonBuilder gsonBuilder = new GsonBuilder();
        final Gson gson = gsonBuilder.create();
        List<AssetMainModel> assetList = gson.fromJson(response.body().charStream(), new TypeToken<List<AssetMainModel>>(){}.getType());


//        AssetMainModel[] assetList = gson.fromJson(response.body().charStream(), AssetMainModel[].class);

        return assetList;

    }


}
