package zk.springboot.Models;

import java.util.Date;

//AssetHistory for modifying the asset
public class AssetHistory {

    private String actionId;
    private String actionTaken;
    private String description;
    private Date date;
    private String authorizedUserName;
    private double actionCost;

    public AssetHistory(String actionId,
                        String actionTaken,
                        String description,
                        Date date,
                        String authorizedUserName,
                        double actionCost)
    {
        this.actionTaken = actionTaken;
        this.actionId = actionId;
        this.description = description;
        this.date = date;
        this.authorizedUserName = authorizedUserName;
        this.actionCost = actionCost;
    }
    public AssetHistory(){
    }


    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthorizedUserName() {
        return authorizedUserName;
    }

    public void setAuthorizedUserName(String authorizedUserName) {
        this.authorizedUserName = authorizedUserName;
    }

    public double getActionCost() {
        return actionCost;
    }

    public void setActionCost(double actionCost) {
        this.actionCost = actionCost;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
