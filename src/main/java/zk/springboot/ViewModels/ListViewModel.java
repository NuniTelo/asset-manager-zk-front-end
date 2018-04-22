package zk.springboot.ViewModels;

import org.zkoss.bind.annotation.Init;
import zk.springboot.API.ApiService;
import zk.springboot.FilterArgs;
import zk.springboot.Models.AssetMainModel;

import java.util.List;
import java.util.logging.Filter;

public class ListViewModel {
    private List<AssetMainModel> assetList;

    @Init
    public void assetListModel() throws Exception {
        assetList = ApiService.getData(FilterArgs.BASE_API_URL);
    }

    public List<AssetMainModel> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<AssetMainModel> assetList) {
        this.assetList = assetList;
    }
}
