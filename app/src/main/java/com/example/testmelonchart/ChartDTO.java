package com.example.testmelonchart;

public class ChartDTO {

    private String title;
    private String name;
    private String rankNum;
    private String imageUrl;

    public ChartDTO() {
        this.title = title;
        this.name = name;
        this.rankNum = rankNum;
        this.imageUrl = imageUrl;
    }

    public void setRankNum(String rankNum) {
        this.rankNum = rankNum;
    }

    public String getRankNum() {
        return rankNum;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
