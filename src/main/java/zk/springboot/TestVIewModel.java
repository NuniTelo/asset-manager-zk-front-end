package zk.springboot;


import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.A;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import zk.springboot.Models.User;

import java.util.*;

public class TestVIewModel {
    private String emri;
    private String mbiemri;
    private List <String> lista = new ArrayList<>();
    private String curSelectedPerson;
    Label a;
    private String text;
    private Map<String,String> map = new HashMap<>();
    List<String> tags = Arrays.asList("Nuni","Test");
    List<String> t2 = Arrays.asList("n2","t2");
    User user = new User(tags,t2);
    List<User> users = new ArrayList<>();

    public String getCurSelectedPerson() {
        return curSelectedPerson;
    }

    public void setCurSelectedPerson(String curSelectedPerson) {
        this.curSelectedPerson = curSelectedPerson;
    }

    @Init
    public void init(){
        emri = "Nuni";
        mbiemri = "Telo";
        lista.add("test");
        lista.add("test2");
        text="text";
        map.put("emri","Nuni");
        map.put("mbiemri","Telo");
        map.put("mosha","21");
        users.add(user);


    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Command("show")
    @NotifyChange({"emri","mbiemri"})
    public void showData(){
        emri = "Naun";
        mbiemri = "Telo";


    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Command("clicked")
    @NotifyChange({"selectedItem","text"})
    public void clicked() {

        Messagebox.show(text);

    }


    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
