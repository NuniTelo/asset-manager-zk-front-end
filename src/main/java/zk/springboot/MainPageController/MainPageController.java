package zk.springboot.MainPageController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jfree.text.TextBox;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;
import zk.springboot.API.ApiService;
import zk.springboot.FilterArgs;
import zk.springboot.Models.AssetMainModel;

import java.util.List;
import java.util.Map;

public class MainPageController extends SelectorComposer<Component> {

    @Wire
    private Textbox textValue;

    @Wire
    private Button clickMe;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }


    @Listen("onClick= #clickMe")
    public void clicked() throws Exception{
//        Clients.showBusy("Loading data...");
        textValue.setValue("");

        //here we filter all the features
        List<AssetMainModel> model = ApiService.getData(FilterArgs.BASE_API_URL);
        Map<String,Object> spec = model.get(0).getSpecificProperties();


        System.out.println(spec.get("source"));

//        Clients.clearBusy();

    }
}
