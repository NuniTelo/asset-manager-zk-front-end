package zk.springboot.Models;


import org.springframework.data.mongodb.core.geo.GeoJsonMultiPoint;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.*;


public class AssetMainModel {
    //Id of the asset, can be random and it must be UNIQUE

    private String id;

    //what brand an asset is , ex : Sony]

    private String brand;


    //model of the asset , ex : A103
    private String model;


    //this is the name that will be used to display on the map
    private String name;


    //main category where it belongs
    private String category;


    //main subcategory where this asset belongs
    private String subcategory;


    //unique, since it's serial_no
    private String serial_no;


    //status of the asset
    private String assetStatus ="DRAFT";

    //location is saved as an objet with two fields
    private Date installationDate;


    //location is saved as an objet with two fields
    private GeoJsonPoint location;


    //this will be an arraylist of object assetHistory
    private List<AssetHistory> assetHistory = new ArrayList<>();


    //what condition is GOOD, POOR , BROKEN. Will be stored in the FilterArgs
    private String assetCondition = "UNCHECKED";


    //unit of meassure
    private String unitOfMeasure;


    //long description for the asset
    private String longDescription= "";


    //ingredients + tags for the asset
    private List<String> tags = new ArrayList<>();


    //TRUE if have multipoits, ex: Road. False if asset have only one.
    private boolean multiGeopoints = false;


    //List of all geopoints if multiGeopoints is TRUE
    private GeoJsonMultiPoint listGeopoints;

    //Dimension is an object that will hold the WIDTH,HEIGHT AND LENGTH
    private Dimensions dimensions ;


    //url that will hold marker-image
    private String mapMarker = "http://chittagongit.com/images/map-png-icon/map-png-icon-4.jpg";


    //this will be an array that will hold special features about an asset
    private List<String> specialFeatures =new ArrayList<>();

    private Map<String,Object> specificProperties= new HashMap<>();

    public AssetMainModel(String id, String brand, String model, String name, String category,
                          String subcategory, String serial_no, String assetStatus, Date installationDate,
                          GeoJsonPoint location, List<AssetHistory> assetHistory, String assetCondition,
                          String unitOfMeasure, String longDescription, List<String> tags, boolean multiGeopoints,
                          GeoJsonMultiPoint listGeopoints, Dimensions dimensions, String mapMarker, List<String> specialFeatures
                          , Map<String, Object> specificProperties
 ) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.name = name;
        this.category = category;
        this.subcategory = subcategory;
        this.serial_no = serial_no;
        this.assetStatus = assetStatus;
        this.installationDate = installationDate;
        this.location = location;
        this.assetHistory = assetHistory;
        this.assetCondition = assetCondition;
        this.unitOfMeasure = unitOfMeasure;
        this.longDescription = longDescription;
        this.tags = tags;
        this.multiGeopoints = multiGeopoints;
        this.listGeopoints = listGeopoints;
        this.dimensions = dimensions;
        this.mapMarker = mapMarker;
        this.specialFeatures = specialFeatures;
        this.specificProperties = specificProperties;
    }


    public AssetMainModel(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public GeoJsonPoint getLocation() {
        return location;
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public List<AssetHistory> getAssetHistory() {
        return assetHistory;
    }

    public void setAssetHistory(List<AssetHistory> assetHistory) {
        this.assetHistory = assetHistory;
    }

    public String getAssetCondition() {
        return assetCondition;
    }

    public void setAssetCondition(String assetCondition) {
        this.assetCondition = assetCondition;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setOtherData(List<String> tags ) {
        this.tags = tags;
    }

    public boolean isMultiGeopoints() {
        return multiGeopoints;
    }

    public void setMultiGeopoints(boolean multiGeopoints) {
        this.multiGeopoints = multiGeopoints;
    }

    public GeoJsonMultiPoint getListGeopoints() {
        return listGeopoints;
    }

    public void setListGeopoints(GeoJsonMultiPoint listGeopoints) {
        this.listGeopoints = listGeopoints;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getMapMarker() {
        return mapMarker;
    }

    public void setMapMarker(String mapMarker) {
        this.mapMarker = mapMarker;
    }

    public List<String> getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(List<String> specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Map<String, Object> getSpecificProperties() {
        return specificProperties;
    }

    public void setSpecificProperties(Map<String, Object> specificProperties) {
        this.specificProperties = specificProperties;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }
}
